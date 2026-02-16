import java.util.*;

public class Heapefy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            boolean ok = true;
            for (int i = 1; i <= n; i++) {
                if (root(i) != root(a[i])) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }

    static int root(int x) {
        while (x % 2 == 0) {
            x /= 2;
        }
        return x;
    }
}