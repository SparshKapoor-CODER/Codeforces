import java.util.*;
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            
            boolean[] present = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val <= n) present[val] = true;
            }

            int[] dist = new int[n + 1];
            Arrays.fill(dist, -1);

            Queue<Integer> pq = new LinkedList<>();
            List<Integer> uniquesGreaterOne = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                if (present[i]) {
                    dist[i] = 1;
                    pq.add(i);
                    uniquesGreaterOne.add(i);
                }
            }
            
            if (present[1]) dist[1] = 1;

            while (!pq.isEmpty()) {
                int u = pq.poll();

                for (int v : uniquesGreaterOne) {
                    
                    long nextProd = (long) u * v;
                    if (nextProd > n) {
                        break;
                    } 

                    int next = (int) nextProd;
                    if (dist[next] == -1) {
                        dist[next] = dist[u] + 1;
                        pq.add(next);
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sb.append(dist[i]).append(i == n ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}