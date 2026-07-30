import java.util.*;
public class FuturePuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String b = sc.next();
            StringBuilder a = new StringBuilder();
            
            int prev = -1; 
            for (int i = 0; i < n; i++) {
                int bVal = b.charAt(i) - '0';
                int high = bVal + 1;
                int low  = bVal;
                
                int chosen;
                if (high != prev) {
                    chosen = high;
                }
                
                else if (low != prev) {
                    chosen = low;
                }
                
                else {
                    chosen = high;
                }
                
                a.append(chosen - bVal);
                prev = chosen;
            }
            System.out.println(a);
        }
    }
}