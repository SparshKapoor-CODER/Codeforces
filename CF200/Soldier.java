import java.util.*;
public class Soldier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = (k * w * (w + 1)) / 2;
        int amountToBorrow = totalCost - n;

        System.out.println(amountToBorrow > 0 ? amountToBorrow : 0);
    }
}