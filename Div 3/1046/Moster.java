import java.util.*;
public class Moster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);

            long[] preB = new long[n + 1];
            for (int i = 0; i < n; i++) {
                preB[i + 1] = preB[i] + b[i];
            }

            long maxScore = 0;

            for (int i = 0; i < n; i++) {
            
                if (i > 0 && a[i] == a[i - 1]) {
                    continue;
                }

                long x = a[i];
                long usableSwords = n - i;

    
                int low = 0;
                int high = n;
                int k = 0;
                
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (preB[mid] <= usableSwords) {
                        k = mid;
                        low = mid + 1;
                    }
                    
                    else {
                        high = mid - 1;
                    }
                }

                long currentScore = x * k;
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                }
            }
            System.out.println(maxScore);
        }
    }
}