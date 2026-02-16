import java.util.*;
public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[][] dp = new int[2][7]; 
            final int INF = 1_000_000;
            
            for (int v = 1; v <= 6; v++) {
                dp[0][v] = (a[0] == v) ? 0 : 1;
            }

            for (int i = 1; i < n; i++) {
                int cur = i & 1;
                int prev = 1 - cur;
                for (int v = 1; v <= 6; v++) {
                    int best = INF;
                    for (int u = 1; u <= 6; u++) {
                        if (u != v && u + v != 7) {
                            best = Math.min(best, dp[prev][u]);
                        }
                    }
                    dp[cur][v] = best + ((a[i] == v) ? 0 : 1);
                }
            }
            int ans = INF;
            int last = (n - 1) & 1;
            for (int v = 1; v <= 6; v++) {
                ans = Math.min(ans, dp[last][v]);
            }
            System.out.println(ans);
        }
    }
}