import java.util.*;
public class XOR_C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            
            if (n == 3) {
                out.append("2 1 3\n");
                continue;
            }
            
            p[n] = 1;
            
            for (int i = 2; i <= n - 1; i++) {
                p[i] = i ^ 1;
            }
            
            
            boolean[] used = new boolean[n + 1];
            used[1] = true;
            for (int i = 2; i <= n - 1; i++) {
                used[p[i]] = true;
            }
            
            for (int i = 1; i <= n; i++) {
                if (!used[i]) {
                    p[1] = i;
                    used[i] = true;
                    break;
                }
            }
            
            List<Integer> missing = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (!used[i]) {
                    missing.add(i);
                }
            }
            
            if (!missing.isEmpty()) {
                Arrays.fill(p, 0);
                if (n % 2 == 1) {
                    p[1] = n - 1;
                    p[n] = 1;
                    for (int i = 2; i <= n - 1; i++) {
                        p[i] = (i ^ 1);
                        if (p[i] == n - 1) p[i] = n;
                    }
                }
                
                else {
                    p[1] = n;
                    p[n] = 1;
                    for (int i = 2; i <= n - 1; i++) {
                        p[i] = i ^ 1;
                    }
                }
            }
            
            for (int i = 1; i <= n; i++) {
                out.append(p[i]);
                if (i < n) out.append(' ');
            }
            out.append('\n');
        }
        
        System.out.print(out.toString());
        sc.close();
    }
}