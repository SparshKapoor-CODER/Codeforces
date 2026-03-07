import java.util.*;

public class eatingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];
            int totalDishes = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                totalDishes += a[i];
            }

            boolean[] possibleWinner = new boolean[n];

            // Try every possible starting player
            for (int start = 0; start < n; start++) {
                int[] dishes = a.clone();      // copy of current state
                int remaining = totalDishes;
                int cur = start;
                int winner = -1;

                while (remaining > 0) {
                    if (dishes[cur] > 0) {
                        dishes[cur]--;
                        remaining--;
                        if (remaining == 0) {
                            winner = cur;
                            break;
                        }
                    }
                    cur = (cur + 1) % n;
                }
                possibleWinner[winner] = true;
            }

            // Count distinct possible winners
            int ans = 0;
            for (boolean b : possibleWinner) {
                if (b){
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}