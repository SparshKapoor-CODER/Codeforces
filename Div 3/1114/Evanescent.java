import java.util.*;
public class Evanescent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int runs = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    runs++;
                }
            }
            
            
            boolean foundSameNeighbor = false;
            boolean foundLengthOne = false;
            
            
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1)) {
                    foundLengthOne = true;
                    if (s.charAt(i - 1) == s.charAt(i + 1)) {
                        foundSameNeighbor = true;
                        break; 
                    }
                }
            }
            
            if (foundSameNeighbor) {
                System.out.println(runs - 2);
            }
            
            else if (foundLengthOne) {
                System.out.println(runs - 1);
            }
            
            else {
                System.out.println(runs);
            }
        }
    }
}