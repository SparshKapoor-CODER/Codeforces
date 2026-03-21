import java.util.*;
public class Array_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int greaterCount = 0;
                int smallerCount = 0;
                
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[i]) {
                        greaterCount++;
                    }
                    else if (arr[j] < arr[i]) {
                        smallerCount++;
                    }
                }
                
                System.out.print(Math.max(greaterCount, smallerCount) + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}