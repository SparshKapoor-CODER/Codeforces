import java.util.*;
public class twoSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            int minIdx = 0;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) < s.charAt(minIdx)) {
                    minIdx = i;
                }
            }

            String a = s.substring(minIdx, minIdx + 1);
            String b = s.substring(0, minIdx) + s.substring(minIdx + 1);
            System.out.println(a + " " + b);
        }
    }
}