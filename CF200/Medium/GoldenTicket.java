import java.util.*;
public class GoldenTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += s.charAt(i) - '0';
        }

        if (total == 0) {
            System.out.println("YES");
            return;
        }

        for (int target = 1; target <= total; target++) {
            int cur = 0;
            int segments = 0;
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                cur += s.charAt(i) - '0';

                if (cur == target) {
                    segments++;
                    cur = 0;
                }
                
                else if (cur > target) {
                    ok = false;
                    break;
                }
            }

            
            if (ok && cur == 0 && segments >= 2) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}