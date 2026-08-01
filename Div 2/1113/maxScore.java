import java.util.*;
public class maxScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                a[i] = sc.nextInt();
            }

            int[] first = new int[n + 1];
            int[] second = new int[n + 1];
            Arrays.fill(first, -1);
            for (int i = 0; i < 2 * n; i++) {
                int val = a[i];
                if (first[val] == -1) {
                    first[val] = i;
                } else {
                    second[val] = i;
                }
            }

            long[][] intervals = new long[n][3]; 
            for (int i = 1; i <= n; i++) {
                int L = first[i];
                int R = second[i];
                long len = R - L + 1;
                intervals[i - 1][0] = L;
                intervals[i - 1][1] = R;
                intervals[i - 1][2] = len * (len - 1); 
            }

            Arrays.sort(intervals, Comparator.comparingLong(o -> o[1]));

            long[] dp = new long[n];
            dp[0] = intervals[0][2];
            for (int i = 1; i < n; i++) {
                long include = intervals[i][2];
                int L = (int) intervals[i][0];

                // Binary search: last interval with R < L
                int lo = 0, hi = i - 1, idx = -1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if (intervals[mid][1] < L) {
                        idx = mid;
                        lo = mid + 1;
                    }
                    else {
                        hi = mid - 1;
                    }
                }
                if (idx != -1) {
                    include += dp[idx];
                }
                dp[i] = Math.max(dp[i - 1], include);
            }

            long ans = 2L * n + dp[n - 1];
            System.out.println(ans);
        }
    }
}