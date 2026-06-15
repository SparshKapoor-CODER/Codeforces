import java.util.*;
public class Team {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        int c = 0;        

        while (t-- > 0) {
            int s = 0;
            for (int i = 0; i < 3; i++) {
                s += sc.nextInt();
            }
            if (s >= 2) {    
                c++;
            }
        }
        System.out.println(c);
    }
}