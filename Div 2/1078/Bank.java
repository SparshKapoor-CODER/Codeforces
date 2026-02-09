import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long totalTransfers = 0;
            long[] transfers = new long[n];
            
            for (int i = 0; i < n; i++) {
                // Maximum number of transfers from bank i
                transfers[i] = a[i] / x;
                totalTransfers += transfers[i];
            }

            long answer = 0;
            for (int i = 0; i < n; i++) {
                // If bank i is the target:
                // It gets its original amount plus gains from transfers from ALL OTHER banks
                long candidate = a[i] + y * (totalTransfers - transfers[i]);
                answer = Math.max(answer, candidate);
            }

            System.out.println(answer);
        }
        sc.close();
    }
}