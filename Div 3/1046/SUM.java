import java.util.*;

public class SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
            
            for (int i = 1; i <= n; i++){ 
                a[i] = sc.nextInt();
            }

            for (int i = 1; i <= n; i++){ 
                b[i] = sc.nextInt();
            }

            // 1. Calculate the Suffix Max
            // suffixMax[i] stores the largest value available from index i to n
            long[] suffixMax = new long[n + 2];
            for (int i = n; i >= 1; i--) {
                suffixMax[i] = Math.max(Math.max(a[i], b[i]), suffixMax[i + 1]);
            }

            // 2. Calculate Prefix Sum of the Suffix Maxes
            // This allows us to calculate the sum of any range [l, r] in O(1) time
            long[] pref = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1] + suffixMax[i];
            }

            // 3. Process and Print Queries
            // Using StringBuilder to speed up output (System.out.print is slow)
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                long rangeSum = pref[r] - pref[l - 1];
                sb.append(rangeSum).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}