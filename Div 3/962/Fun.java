import java.util.*;

public class Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {
            long n = sc.nextLong();
            int x = sc.nextInt();

            long count = 0;

            for (int a = 1; a <= x - 2; a++) {
                for (int b = 1; b <= x - a - 1; b++) {

                    long ab = (long) a * b;
                    if (ab > n) break;

                    long maxC1 = x - a - b;
                    long maxC2 = (n - ab) / (a + b);

                    long cMax = Math.min(maxC1, maxC2);
                    if (cMax >= 1) {
                        count += cMax;
                    }
                }
            }

            System.out.println(count);
        }
    }
}