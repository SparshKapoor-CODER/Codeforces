import java.util.*;
public class MarinAndPhotoshoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                    ans += 2;
                } else if (i + 2 < n && s.charAt(i) == '0' && s.charAt(i + 1) == '1' && s.charAt(i + 2) == '0') {
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }
}