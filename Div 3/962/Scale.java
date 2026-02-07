import java.util.*;
public class Scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String arr[] = new String[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.next();
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i%k == 0 && j%k == 0){
                        System.out.print(arr[i].charAt(j));
                    }
                }
                if(i%k == 0){
                    System.out.println();
                }
            }
        }
    }
}

/**
 * Explenation:
 * 
 * The code reads multiple test cases, each containing a grid of characters.
 * For each test case, it processes the grid to extract and print characters located at positions
 * where both the row index (i) and column index (j) are multiples of a given integer k.
 * This effectively scales down the grid by a factor of k, printing only the characters
 * that meet the specified condition.
 * 
 * 
 */