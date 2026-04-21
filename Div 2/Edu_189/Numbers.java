import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (y == 2 * x) {
                System.out.println("NO");
            } 
            else {
                System.out.println("YES");
            }
        }
    }
}