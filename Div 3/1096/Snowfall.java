import java.util.*;

public class Snowfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>(); 
            List<Integer> C = new ArrayList<>(); 
            List<Integer> D = new ArrayList<>(); 
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                boolean by2 = x % 2 == 0;
                boolean by3 = x % 3 == 0;
                
                if (by2 && by3)      A.add(x);
                else if (by2)        B.add(x);
                else if (by3)        C.add(x);
                else                 D.add(x);
            }
            
            StringBuilder sb = new StringBuilder();
            for (int x : A) sb.append(x).append(' ');
            for (int x : B) sb.append(x).append(' ');
            for (int x : D) sb.append(x).append(' ');
            for (int x : C) sb.append(x).append(' ');
            
            System.out.println(sb.toString().trim());
        }
    }
}