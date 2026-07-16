import java.util.*;
public class Drawings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int maxLen = 0;
            int i = 0;
            while (i < n) {
                if (s.charAt(i) == '#') {
                    int j = i;

                    while (i < n && s.charAt(i) == '#') {
                        i++;
                    }

                    int len = i - j;

                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
                
                else {
                    i++;
                }
            }

            int ans = (maxLen + 1) / 2;
            System.out.println(ans);
        }
    }
}