import java.util.*;
public class costomPalindromeBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n == 10) {
                System.out.println("-1");
            }
            else if (n % 12 == 10) {
                System.out.println("22 " + (n - 22));
            }
            else {
                long a = n % 12;
                System.out.println(a + " " + (n - a));
            }
        }
    }
}