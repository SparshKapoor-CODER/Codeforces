import java.util.*;
public class Distances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
            
            for (int i = 2; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.print("1 ");
            
            System.out.print("1 ");
            for (int i = n; i >= 2; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}