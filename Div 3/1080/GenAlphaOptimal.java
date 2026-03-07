import java.util.*;

public class GenAlphaOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int p = 1;
            boolean flag = false;
            int min = 0;
            int max = n - 1;

             while(min <= max) {
                int mid = (min + max) / 2;
                
                if(arr[mid] == 67) {
                    flag = true;
                    break;
                }
                else if(arr[mid] < 67) {
                    min = mid + 1;
                }
                else {
                    max = mid - 1;
                }
            }

            if(flag) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
    }
}