import java.util.*;
public class Coins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (k % 2 == 1 || n % 2 == 0) {
                System.out.println("YES");
            }
            
            else {
                System.out.println("NO");
            }
        }
    }
}