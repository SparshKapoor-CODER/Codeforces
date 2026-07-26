import java.util.*;
public class Threshold{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            if(n % 2 == 1){
                System.out.println("NO");
                continue;
            }

            int minOdd = Integer.MAX_VALUE; 
            int maxEven = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++){
                if(i % 2 == 0){ 
                    if(arr[i] < minOdd){
                        minOdd = arr[i];
                    }
                }
                
                else { 
                    if(arr[i] > maxEven){
                        maxEven = arr[i];
                    }
                }
            }

            if(maxEven + 1 < minOdd){
                System.out.println("YES");
            }
            
            else {
                System.out.println("NO");
            }
        }
    }
}