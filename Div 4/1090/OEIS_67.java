import java.util.*;
public class OEIS_67 {
    static int[] primes;
    static int primeCount = 0;
    public static void main(String[] args) {
    
        int LIMIT = 200000;
        boolean[] isComposite = new boolean[LIMIT + 1];
        int count = 0;
        for (int i = 2; i <= LIMIT; i++) {
            if (!isComposite[i]) count++;
            for (int j = 2; (long) i * j <= LIMIT; j++) {
                isComposite[i * j] = true;
            }
        }
        primes = new int[count];
        int idx = 0;
        for (int i = 2; i <= LIMIT; i++) {
            if (!isComposite[i]) primes[idx++] = i;
        }
 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
 
            for (int i = 0; i < n; i++) {
                long val = (long) primes[i] * primes[i + 1];
                sb.append(val);
                if (i < n - 1) sb.append(' ');
            }
            System.out.println(sb);
        }
    }
}