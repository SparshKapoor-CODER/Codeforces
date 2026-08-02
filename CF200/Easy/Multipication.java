import java.util.*;
public class Multipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;

        for(int i = 1;i<=n && i*i <=k;i++){
            if(k % i == 0){
                int j = k/i;

                if (j <= n) {
                    if (i == j) {
                        ans++;
                    }
                    else {
                        ans += 2;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}