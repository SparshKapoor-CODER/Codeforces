import java.util.*;

public class ValidParanthisis_ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int open = 0, close = 0;
            for (char c : s.toCharArray()) {
                if (c == '('){
                    open++;
                }
                else {
                    close++;
                }
            }
            
            System.out.println((n % 2 == 0 && open == close) ? "YES" : "NO");
        }
    }
}