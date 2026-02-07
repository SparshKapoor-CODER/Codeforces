import java.util.*;

public class Secret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            List<Long> results = new ArrayList<>();
            for (long i = 1; i <= n / 10; i *= 10) {
                if ((n - i) % i == 0) {
                    results.add((n - i) / i);
                }
            }
            if (results.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(results);
                System.out.print(results.size() + " ");
                for (long res : results) {
                    System.out.print(res + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}