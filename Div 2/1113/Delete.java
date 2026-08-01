import java.util.*;
public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            String best = null;

            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != '0'){
                    continue;
                }

                String s1 = s.substring(0, i) + s.substring(i + 1);
                int m = s1.length();

                int j = -1;
                for (int k = 0; k < m - 1; k++) {
                    if (s1.charAt(k) == '1' && s1.charAt(k + 1) == '0') {
                        j = k;
                        break;
                    }
                }
                
                if (j == -1) {
                    for (int k = 0; k < m; k++) {
                        if (s1.charAt(k) == '1') {
                            j = k;
                            break;
                        }
                    }
                }

                String s2 = s1.substring(0, j) + s1.substring(j + 1);

                if (best == null || s2.compareTo(best) > 0) {
                    best = s2;
                }
            }
            System.out.println(best);
        }
    }
}