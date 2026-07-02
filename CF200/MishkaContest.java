import java.util.*;
public class MishkaContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;

        int left = 0;

        while (left < n && a[left] <= k) {
            ans++;
            left++;
        }

        
        int right = n - 1;
        while (right >= left && a[right] <= k) {
            ans++;
            right--;
        }

        System.out.println(ans);
    }
}