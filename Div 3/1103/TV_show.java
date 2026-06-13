import java.util.*;
public class TV_show {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            boolean possible = true;
            
            for (int r = 0; r < k; r++) {
                int cnt = 0;
                
                for (int i = r; i < n; i += k) {
                    if (s.charAt(i) == '1') cnt++;
                }

                if (cnt % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}