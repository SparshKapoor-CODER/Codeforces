import java.util.*;
public class PointsSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[] covered = new boolean[m + 1]; 

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int j = l; j <= r; j++) {
                covered[j] = true;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            if (!covered[i]) {
                ans.add(i);
            }
        }

        int k = ans.size();
        System.out.println(k);

        if (k > 0) {
            for (int i = 0; i < k; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(ans.get(i));
            }
            System.out.println();
        }
    }
}