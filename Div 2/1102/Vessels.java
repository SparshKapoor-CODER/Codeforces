import java.util.*;

public class Vessels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }

            long[] ans = new long[n];
            int[] B = new int[n];
            int[] pre = new int[n];
            int[] suf = new int[n];

            for (int l = 0; l < n; l++) {
                for (int i = 0; i < n; i++) {
                    B[i] = h[(l + i) % n];
                }

                
                pre[0] = B[0];
                for (int i = 1; i < n; i++) {
                    pre[i] = Math.max(pre[i - 1], B[i]);
                }

                
                suf[n - 1] = B[n - 1];
                for (int i = n - 2; i >= 0; i--) {
                    suf[i] = Math.max(suf[i + 1], B[i]);
                }

                long sum = 0;
                for (int i = 1; i < n; i++) {
                    sum += Math.min(pre[i - 1], suf[i]);
                }
                ans[l] = sum;
            }

            for (int i = 0; i < n; i++) {
                out.append(ans[i]).append(" ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}