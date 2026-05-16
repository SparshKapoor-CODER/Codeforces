import java.util.*;
public class Blocked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] freq = new int[101];
            boolean possible = true;
            for (int x : arr) {
                freq[x]++;
                if (freq[x] > 1) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println(-1);
            }
            
            else {
                Arrays.sort(arr);
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i]);
                    if (i > 0){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}