import java.util.*;
public class MinusTWO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int cntOdd = 0;
            int cntEvenMod0 = 0; 
            int cntEvenMod2 = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    cntOdd++;
                }
                
                else {
                    if (a % 4 == 0) {
                        cntEvenMod0++;
                    }
                    
                    else {
                        cntEvenMod2++;
                    }
                }
            }

            int ans = Math.max(cntOdd, Math.max(cntEvenMod0, cntEvenMod2));
            System.out.println(ans);
        }
    }
}