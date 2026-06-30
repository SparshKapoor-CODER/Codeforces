import java.util.*;

public class RemovevomeR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int blocks = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    blocks++;
                }
            }
            
            if (blocks == 2) {
                System.out.println(2);
            }
            
            else {
                System.out.println(1);
            }
        }
    }
}