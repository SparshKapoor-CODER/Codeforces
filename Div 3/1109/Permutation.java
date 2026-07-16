import java.util.*;
public class Permutation {

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int g = gcd(x, y);

            int[] p = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                p[i] = sc.nextInt();
            }

            boolean possible = true;
            for (int i = 1; i <= n; i++) {
                if (i % g != p[i] % g) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println("YES");
            }
            
            else {
                System.out.println("NO");
            }
        }
    }
}