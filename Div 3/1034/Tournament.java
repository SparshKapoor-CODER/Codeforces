import java.util.*;

public class Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            int max = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
            }

            int aj = arr[j - 1];

            if (k == 1) {
                System.out.println(aj == max ? "YES" : "NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
