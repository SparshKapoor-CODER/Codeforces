import java.util.*;
public class CF_Cheak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char chars[] = {'c','o','d','e','f','r','s'};
        Arrays.sort(chars);

        while(t-->0){
            char ch = sc.next().charAt(0);

            int left = 0;
            int right = 6;
            boolean flag = false;

            while(left<=right){
                int mid = (left+right)/2;
                if(chars[mid] == ch){
                    System.out.println("Yes");
                    flag = true;
                    break;
                }
                else if(chars[mid] < ch){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            if(!flag){
                System.out.println("No");
            }
        }
    }
}