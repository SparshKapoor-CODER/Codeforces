import java.util.*;
public class Euchlid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (n == 2) {
                int x = Math.max(arr[0], arr[1]);
                int y = Math.min(arr[0], arr[1]);
                System.out.println(x + " " + y);
                continue;
            }

            Arrays.sort(arr);
            
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }

            boolean possible = true;
            for (int i = 0; i < n - 2; i++) {
                if (arr[i] % arr[i + 1] != arr[i + 2]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println(arr[0] + " " + arr[1]);
            }
            else {
                System.out.println("-1");
            }
        }
    }
}