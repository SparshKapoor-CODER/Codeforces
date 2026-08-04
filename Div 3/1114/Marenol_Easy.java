import java.util.*;
public class Marenol_Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            
            int onesA = 0, evenA = 0;
            int onesB = 0, evenB = 0;
            
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    onesA++;
                    if (i % 2 == 0){
                        evenA++;
                    }
                }
                if (b.charAt(i) == '1') {
                    onesB++;
                    if (i % 2 == 0){
                        evenB++;
                    }
                }
            }
            
            if (onesA == onesB && evenA == evenB) {
                System.out.println("YES");
            }
            
            else {
                System.out.println("NO");
            }
        }
    }
}