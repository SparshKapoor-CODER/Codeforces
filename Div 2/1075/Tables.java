import java.util.*;
public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();
            
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int countH = 0;
            int countL = 0;
            int countBoth = 0;
            
            int minHL = Math.min(h, l);
            
            for(int num : arr) {
                if(num <= h){
                    countH++;
                }

                if(num <= l) {
                    countL++;
                }
                
                if(num <= minHL) {
                    countBoth++;
                }
            }
            
            int ans = Math.min(countH, countL);
            ans = Math.min(ans, (countH + countL - countBoth) / 2);
            
            System.out.println(ans);
        }
    }
}