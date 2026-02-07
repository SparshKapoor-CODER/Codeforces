import java.util.*;

public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] preMin = new int[n];
            int[] sufMax = new int[n];

            // Prefix minimum
            preMin[0] = a[0];
            for (int i = 1; i < n; i++) {
                preMin[i] = Math.min(preMin[i - 1], a[i]);
            }

            // Suffix maximum
            sufMax[n - 1] = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                sufMax[i] = Math.max(sufMax[i + 1], a[i]);
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (a[i] == preMin[i] || a[i] == sufMax[i]) {
                    ans.append('1');
                } else {
                    ans.append('0');
                }
            }

            System.out.println(ans.toString());
        }

    }
}
