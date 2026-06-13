import java.util.*;
public class Convergence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            if(n == 1) {
                System.out.println(0);
                continue;
            }
            if(n == 2) {
                System.out.println(a[0] == a[1] ? 0 : 1);
                continue;
            }
            int c = 0;
            for(int i = 0,j = n-1; (i < n) && (i <= j); i++,j--) {
                if (a[i] == a[j]) {
                    break;
                }
                c++;
            }
            System.out.println(c);
        }
    }
}