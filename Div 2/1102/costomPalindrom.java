import java.util.*;

public class costomPalindrom {
    
    static long[][] bestH = new long[20][12]; 
    static final long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        precompute();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            long n = sc.nextLong();
            if (isPalindrome(n)) {
                out.append(n).append(" 0\n");
                continue;
            }
            if (n % 12 == 0) {
                out.append("0 ").append(n).append("\n");
                continue;
            }

            if (n <= 10000) {
                boolean found = false;
                for (long a = 0; a <= n; a++) {
                    if (isPalindrome(a) && (n - a) % 12 == 0) {
                        out.append(a).append(" ").append(n - a).append("\n");
                        found = true;
                        break;
                    }
                }
                if (!found) out.append("-1\n");
                continue;
            }

            long target = n % 12;
            int len = Long.toString(n).length();
            boolean ok = false;

           
            for (int L = len - 1; L >= Math.max(1, len - 2); L--) {
                long H = bestH[L][(int) target];
                if (H == INF) continue;
                long p = makePalindrome(H, L);
                

                if (L < len || p <= n) {
                    out.append(p).append(" ").append(n - p).append("\n");
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                out.append("-1\n");
            }
        }
        System.out.print(out);
    }



    static void precompute() {
        for (int L = 1; L <= 19; L++) {
            Arrays.fill(bestH[L], INF);
            int halfLen = (L + 1) / 2;
            long start = (long) Math.pow(10, halfLen - 1);
            long end = (long) Math.pow(10, halfLen) - 1;

            if (L <= 5) {
                for (long H = start; H <= end; H++) {
                    long p = makePalindrome(H, L);
                    int r = (int) (p % 12);
                    if (bestH[L][r] == INF) {
                        bestH[L][r] = H;
                    }
                }
            }
            else {
                
                int found = 0;
                for (long d1 = 1; d1 <= 9 && found < 12; d1++) {
                    long base = d1 * start;
                    long limit = Math.min(base + 9999, end);
                    for (long H = base; H <= limit; H++) {
                        long p = makePalindrome(H, L);
                        int r = (int) (p % 12);
                        if (bestH[L][r] == INF) {
                            bestH[L][r] = H;
                            found++;
                            if (found == 12) break;
                        }
                    }
                }
            }
        }
    }

    static long makePalindrome(long H, int L) {
        long res = H;
        long temp = H;
        if (L % 2 == 1){
            temp /= 10;
        }
        while (temp > 0) {
            res = res * 10 + temp % 10;
            temp /= 10;
        }
        return res;
    }

    static boolean isPalindrome(long n) {
        long rev = 0, orig = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return orig == rev;
    }
}