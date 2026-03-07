import java.util.*;
public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int d = 9; d >= 1; d--) {
                if (d <= s) {
                    sb.append(d);
                    s -= d;
                }
            }
            sb.reverse();
            System.out.println(sb);
        }
    }
}