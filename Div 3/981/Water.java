import java.util.*;
public class Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            
            int arr [][] = new int [n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int ans = 0;

            for(int i=0;i<n;i++){
                int x = Integer.MAX_VALUE;
                int mn = Integer.MAX_VALUE;
                for(int j=0;i+j<n;j++){
                    mn = Math.min(mn, arr[j][i+j]);
                    if(i != 0){
                        x = Math.min(x, arr[i+j][j]);
                    }
                }

                if(mn < 0){
                    ans -= mn;
                }

                if(x < 0){
                    ans -= x;
                }
                
            }
            System.out.println(ans);
        }
    }
}