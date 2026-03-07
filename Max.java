import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long evenSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (i % 2 == 0) evenSum += a[i];
            }

            long maxDelta = 0;
            long minEven = 0;          // pref[0] (index 0 is even)
            long minOdd = Long.MAX_VALUE;
            long pref = 0;

            for (int i = 0; i < n; i++) {
                // b[i] = a[i] if i odd, else -a[i]
                long b = (i % 2 == 1) ? a[i] : -a[i];
                pref += b;   // now pref = sum up to i (pref[i+1])

                if (i % 2 == 0) { // r even -> need l odd
                    if (minOdd != Long.MAX_VALUE) {
                        maxDelta = Math.max(maxDelta, pref - minOdd);
                    }
                } else { // r odd -> need l even
                    maxDelta = Math.max(maxDelta, pref - minEven);
                }

                // update minima for future l = i+1
                if ((i + 1) % 2 == 0) {
                    minEven = Math.min(minEven, pref);
                } else {
                    minOdd = Math.min(minOdd, pref);
                }
            }

            long ans = evenSum + maxDelta;
            System.out.println(ans);
        }
        sc.close();
    }
}