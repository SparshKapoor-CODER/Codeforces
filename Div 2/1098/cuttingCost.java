import java.util.*;
public class cuttingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int c0 = 0, c1 = 0, c2 = 0;
            for (int x : arr) {
                if (x == 0){
                    c0++;
                }
                else if (x == 1){
                    c1++;
                }
                else {
                    c2++;
                }
            }

            int maxFrom12 = 0;
            int minPairs = Math.min(c1, c2);
            for (int pairs = 0; pairs <= minPairs; pairs++) {
                int rem1 = c1 - pairs;
                int rem2 = c2 - pairs;
                int groups = pairs + (rem1 / 3) + (rem2 / 3);
                if (groups > maxFrom12) {
                    maxFrom12 = groups;
                }
            }
            
            System.out.println(c0 + maxFrom12);
        }
    }
}