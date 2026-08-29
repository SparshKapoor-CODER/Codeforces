import java.util.*;
public class Carrots1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] freq = new int[m + 2];

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                freq[a]++;
            }

            
            int top1 = 0, top2 = 0;
            for (int i = 1; i <= m; i++) {
                int f = freq[i];
                if (f > top1) {
                    top2 = top1;
                    top1 = f;
                } else if (f > top2) {
                    top2 = f;
                }
            }

            int ans = top1 + top2; 
            int pref = 0; 

            
            for (int x = 1; x <= m; x++) {
                pref += freq[x]; 

                int val = freq[x] + (n - pref);
                if (2 * x <= m) {
                    val += freq[2 * x];
                }

                ans = Math.max(ans, val);
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}