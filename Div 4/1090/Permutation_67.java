import java.util.*;

public class Permutation_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int sacrifice = i + 1;
                int median    = n + 1 + 2 * i;
                int max       = n + 2 + 2 * i;
                sb.append(sacrifice).append(' ').append(median).append(' ').append(max).append(' ');
            }
            System.out.println(sb);
        }
    }
}