import java.util.Scanner;
public class WatermelonDeals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long totalCost = 0;
            long power = 1; 
            long i = 0;     
            while (n > 0) {
                int digit = (int) (n % 3);
                if (digit > 0) {
                    long costPerDeal = 3 * power; 
                    if (i > 0) {
                        costPerDeal += i * (power / 3); 
                    }
                    totalCost += digit * costPerDeal;
                }
                n /= 3;
                power *= 3;
                i++;
            }
            System.out.println(totalCost);
        }
    }
}