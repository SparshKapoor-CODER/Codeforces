import java.util.*;
public class Romantic_Glasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long prefix = 0;
            HashSet<Long> seen = new HashSet<>();
            seen.add(0L);
            boolean found = false;

            for (int i = 1; i <= n; i++) {
                long x = sc.nextLong();

                if (i % 2 == 1) {
                    prefix += x;
                }
                
                else {
                    prefix -= x;
                }

                if (seen.contains(prefix)) {
                    found = true;
                }

                seen.add(prefix);
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}