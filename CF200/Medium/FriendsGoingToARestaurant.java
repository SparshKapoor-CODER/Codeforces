import java.util.*;
public class FriendsGoingToARestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] x = new long[n];


            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }

            long[] d = new long[n];


            for (int i = 0; i < n; i++) {
                long y = sc.nextLong();
                d[i] = y - x[i];
            }

            Arrays.sort(d);

            int l = 0, r = n - 1;
            int days = 0;

            while (l < r) {
                if (d[l] + d[r] >= 0) {
                    days++;
                    l++;
                    r--;
                }
                
                else {
                    l++; 
                }
            }

            System.out.println(days);
        }
    }
}