import java.util.*;
public class Gift_Teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        
        Arrays.sort(a);


        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            int diff = a[i + n - 1] - a[i];
            minDiff = Math.min(minDiff, diff);
        }

        System.out.println(minDiff);
    }
}