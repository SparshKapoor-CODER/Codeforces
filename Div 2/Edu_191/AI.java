import java.util.*;
public class AI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();


            int withoutAI = (n + (x + y) - 1) / (x + y);
            int withAI;
            
            if (n <= (long) x * z) {
                withAI = (n + x - 1) / x;
            }
            else {
                int remaining = n - x * z;
                withAI = z + (remaining + (x + 10 * y) - 1) / (x + 10 * y);
            }
            System.out.println(Math.min(withoutAI, withAI));
            
        }
    }
}