import java.util.*;
public class Plant {
    static final long MOD = 1000000007L;
    static final long INV2 = 500000004L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long pow2 = modPow(2, n);
        long pow4 = modPow(4, n);

        long ans = (pow2 + pow4) % MOD;
        ans = ans * INV2 % MOD;

        System.out.println(ans);
    }

    private static long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}