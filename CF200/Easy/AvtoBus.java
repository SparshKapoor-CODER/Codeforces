import java.util.*;
public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            if (n % 2 == 1 || n == 2) {
                System.out.println(-1);
                continue;
            }
            long minBuses = n / 6;
            if (n % 6 != 0) {
                minBuses++;
            }
            long maxBuses = n / 4;
            System.out.println(minBuses + " " + maxBuses);
        }
    }
}