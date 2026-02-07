import java.util.Scanner;

public class InfiniteDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long k = sc.nextLong();
            System.out.println(calculateDigitSum(k));
        }
        
        sc.close();
    }
    
    static long sumDigitsUpTo(long n) {
        if (n <= 0) return 0;
        long ans = 0;
        for (long factor = 1; factor <= n; factor *= 10) {
            long divisor = factor * 10;
            long quotient = n / divisor;
            long digit = (n / factor) % 10;
            long remainder = n % factor;
            ans += quotient * factor * 45;
            ans += (digit * (digit - 1) / 2) * factor;
            ans += digit * (remainder + 1);
        }
        return ans;
    }
    
    static long calculateDigitSum(long k) {
        long digits = 1;
        long startNum = 1;
        long totalDigitsInBlock = 9;
        
        while (k > totalDigitsInBlock) {
            k -= totalDigitsInBlock;
            digits++;
            startNum *= 10;
            totalDigitsInBlock = 9 * startNum * digits;
        }
        
        long offset = (k - 1) / digits;
        long num = startNum + offset;
        int digitPos = (int)((k - 1) % digits);
        
        long total = sumDigitsUpTo(num - 1);
        
        String s = Long.toString(num);
        for (int i = 0; i <= digitPos; i++) {
            total += (s.charAt(i) - '0');
        }
        
        return total;
    }
}