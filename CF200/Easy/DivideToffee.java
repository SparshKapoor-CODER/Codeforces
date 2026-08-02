import java.util.*;
public class DivideToffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int weight[] = new int[n];

            for (int i = 0; i < n; i++) {
                weight[i] = sc.nextInt();
            }

            
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += weight[i];
            }

            if (sum % 2 != 0) {
                System.out.println("NO");
            } 
            
            else {
                int target = sum / 2;
                boolean dp[] = new boolean[target + 1];
                dp[0] = true;

                for (int i = 0; i < n; i++) {
                    for (int j = target; j >= weight[i]; j--) {
                        dp[j] = dp[j] || dp[j - weight[i]];
                    }
                }

                if (dp[target]) {
                    System.out.println("YES");
                }
                
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}