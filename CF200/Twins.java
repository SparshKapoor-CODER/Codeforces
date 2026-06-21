import java.util.*;
public class Twins{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        int s = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            s += a[i];
            count++;
            if (s > sum / 2) {
                break;
            }
        }
        System.out.println(count);
    }
}