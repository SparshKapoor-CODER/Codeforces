
import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int i = 0;
            int j = n - 1;

            while(i < j){
                if(arr[i] == arr[i+1] || arr[j] == arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[i+1];
                    arr[i+1] = temp;
                }

                i++;
                j--;
            }

            int c = 0;
            for(int k = 1; k < n; k++){
                if(arr[k] == arr[k-1]){
                    c++;
                }
            }

            System.out.println(c);
        }
    }
}