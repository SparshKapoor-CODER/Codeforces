import java.util.*;
public class makeSameSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++){
                b[i] = sc.nextInt();
            }

            if (n < 2 * m) {
                System.out.println("NO");
                continue;
            }

            Arrays.sort(a);
            Arrays.sort(b);

            boolean possible = true;
            for (int i = 0; i < m; i++) {
                
                if (a[i] >= b[i]) {
                    possible = false;
                    break;
                }
                
                if (a[n - m + i] <= b[i]) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}