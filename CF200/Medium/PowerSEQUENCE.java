import java.util.*;
public class PowerSEQUENCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }

        Arrays.sort(a);

        
        long ans = sum - n;
        long maxVal = a[n - 1];
        long limit = maxVal + ans; 

        for (long c = 2; ; c++) {
            
            if (powerExceeds(c, n - 1, limit)) {
                break;
            }

            long cur = 1;
            long cost = 0;

            for (int i = 0; i < n; i++) {
                cost += Math.abs(a[i] - cur);
                if (cost >= ans) {
                    break; 
                }

                if (i < n - 1) {
                    cur *= c; 
                }
            }

            if (cost < ans) {
                ans = cost;
            }
        }

        System.out.println(ans);
    }

    private static boolean powerExceeds(long base, int exp, long limit) {
        long p = 1;
        for (int i = 0; i < exp; i++) {
            if (p > limit / base) {
                return true;
            }
            p *= base;
            if (p > limit) {
                return true;
            }
        }
        return p > limit;
    }
}