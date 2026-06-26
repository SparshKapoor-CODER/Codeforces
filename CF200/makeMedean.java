import java.util.*;
public class makeMedean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int mid = n / 2;
        long ops = 0;

        if (arr[mid] == s) {
            System.out.println(0);
            return;
        }

        if (arr[mid] < s) {
            
            for (int i = mid; i < n; i++) {
                if (arr[i] < s) {
                    ops += s - arr[i];
                }
                else {
                    break; 
                }
            }
        }
        else {
            for (int i = 0; i <= mid; i++) {
                if (arr[i] > s) {
                    ops += arr[i] - s;
                }
            }
        }

        System.out.println(ops);
    }
}


