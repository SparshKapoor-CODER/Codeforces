import java.util.*;
public class Make_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            boolean hasEven = false;
            
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) - '0') % 2 == 0) {
                    hasEven = true;
                    break;
                }
            }
            
            if (!hasEven) {
                System.out.println(-1);
                continue;
            }
            
            int lastDigit = s.charAt(s.length() - 1) - '0';
            if (lastDigit % 2 == 0) {
                System.out.println(0);
                continue;
            }
            
            int firstDigit = s.charAt(0) - '0';
            if (firstDigit % 2 == 0) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }
        }
    }
}