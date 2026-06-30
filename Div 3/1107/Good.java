import java.util.*;
public class Good {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int len = String.valueOf(x).length();
            long y = (long) Math.pow(10, len) + 1;
            System.out.println(y);
        }
    }
}