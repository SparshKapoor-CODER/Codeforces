import java.util.*;

public class Main {
    static final int MOD = 676767677;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sumGt1 = 0;
            int cntGt1 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > 1) {
                    sumGt1 += a[i];
                    cntGt1++;
                }
            }
            long ans;
            if (cntGt1 == 0) {
                ans = 1;
            } else if (a[n - 1] == 1) {
                ans = sumGt1 + 1;
            } else {
                ans = sumGt1;
            }
            System.out.println(ans % MOD);
        }
    }
}