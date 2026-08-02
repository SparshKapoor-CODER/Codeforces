import java.util.*;
public class studentsOnTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        char last = 'N';
        int placed = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '*') {
                last = 'N'; 
            }
            else { 
                
                if (last != 'A' && a > 0 && (a >= b || last == 'B')) {
                    a--;
                    placed++;
                    last = 'A';
                }
                
                else if (last != 'B' && b > 0 && (b >= a || last == 'A')) {
                    b--;
                    placed++;
                    last = 'B';
                }
                
                else {
                    last = 'N';
                }
            }
        }
        System.out.println(placed);
    }
}