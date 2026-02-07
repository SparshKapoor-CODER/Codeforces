import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            // Find the first position where arr[i] is not n-i
            // (in a perfect descending permutation, arr[i] would be n-i)
            int pos = -1;
            for(int i=0;i<n;i++){
                if(arr[i] != n-i){
                    pos = i;
                    break;
                }
            }
            
            if(pos == -1){
                // Already maximum
                for(int num : arr){
                    System.out.print(num + " ");
                }
                System.out.println();
                continue;
            }
            
            // Find where (n-pos) is located (this is what should be at position pos)
            int targetIdx = -1;
            for(int i=pos;i<n;i++){
                if(arr[i] == n-pos){
                    targetIdx = i;
                    break;
                }
            }
            
            // If we couldn't find it, try a different strategy
            if(targetIdx == -1){
                // Find the maximum element after pos
                int maxVal = -1;
                int maxIdx = -1;
                for(int i=pos;i<n;i++){
                    if(arr[i] > maxVal){
                        maxVal = arr[i];
                        maxIdx = i;
                    }
                }
                targetIdx = maxIdx;
            }
            
            // Reverse the segment [pos, targetIdx]
            int l = pos;
            int r = targetIdx;
            while(l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}