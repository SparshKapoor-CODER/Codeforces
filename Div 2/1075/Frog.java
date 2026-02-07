import java.util.*;
public class Frog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            long base = 0;
            long best = 0;

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();

                base += a * (b - 1);

                long slope = a * b - c;
                best = Math.max(best, slope);
            }

            if (base >= x) {
                System.out.println(0);
            }

            else if (best <= 0) {
                System.out.println(-1);
            }

            else {
                long need = x - base;
                long rollbacks = (need + best - 1) / best; 
                System.out.println(rollbacks);
            }
        }
    }
}
