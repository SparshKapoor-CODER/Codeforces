import java.util.*;
public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();

            List<Integer>[] adj = new ArrayList[n + 1];
            int[] indeg = new int[n + 1];
            int[] dp = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int i = 1; i <= n; i++) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                int k = Integer.parseInt(parts[0]);
                indeg[i] = k;
                for (int j = 1; j <= k; j++) {
                    int req = Integer.parseInt(parts[j]);
                    adj[req].add(i); 
                }
            }

            Queue<Integer> q = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                if (indeg[i] == 0) {
                    dp[i] = 1;
                    q.add(i);
                }
            }

            int visited = 0;
            while (!q.isEmpty()) {
                int u = q.poll();
                visited++;
                for (int v : adj[u]) {
                    
                    dp[v] = Math.max(dp[v], dp[u] + (u > v ? 1 : 0));
                    indeg[v]--;
                    if (indeg[v] == 0) {
                        q.add(v);
                    }
                }
            }

            if (visited < n) {
                System.out.println(-1);
            }
            
            else {
                int maxPass = 0;
                for (int i = 1; i <= n; i++) {
                    maxPass = Math.max(maxPass, dp[i]);
                }
                System.out.println(maxPass);
            }
        }
    }
}