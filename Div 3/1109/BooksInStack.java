import java.util.*;
public class BooksInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];


            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long excessSum = 0;         
            long minRequired;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                excessSum += (a[i] - 1);
              
                minRequired = (long) (i + 1) * i / 2; 


                if (excessSum < minRequired) {
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