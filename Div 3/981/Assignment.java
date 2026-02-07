import java.util.*;

public class Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] dp = new int[n + 1];
            dp[0] = 0;

            HashMap<Long, Integer> lastpos = new HashMap<>();
            lastpos.put(0L, 0);

            long prefSum = 0L;

            for (int i = 1; i <= n; i++) {

                prefSum += arr[i - 1];

                // option 1: don't end segment here
                dp[i] = dp[i - 1];

                // option 2: end zero-sum segment here
                if (lastpos.containsKey(prefSum)) {
                    int lrange = lastpos.get(prefSum);
                    dp[i] = Math.max(dp[i], dp[lrange] + 1);
                }

                // update last position of this prefix sum
                lastpos.put(prefSum, i);
            }
            System.out.println(dp[n]);
        }
    }
}