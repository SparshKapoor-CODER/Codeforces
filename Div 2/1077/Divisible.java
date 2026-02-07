import java.util.*;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            
            p[0] = (n + 1) / 2;
            for (int i = 1; i < n; i++) {
                if (i % 2 == 1) {
                    p[i] = p[i - 1] + i;
                }

                else {
                    p[i] = p[i - 1] - i;
                }
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
    }
}