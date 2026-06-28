import java.util.*;
public class oddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumPos = 0;               
        int minPosOdd = Integer.MAX_VALUE;  
        int maxNegOdd = Integer.MIN_VALUE;  
        boolean hasPositive = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0) {
                sumPos += x;
                hasPositive = true;
                
                if (x % 2 != 0 && x < minPosOdd) {
                    minPosOdd = x;
                }
            }
            
            else if (x < 0 && x % 2 != 0) {
                if (x > maxNegOdd) {
                    maxNegOdd = x;
                }
            }
        }

        if (sumPos % 2 != 0) {
            System.out.println(sumPos);
        }
        
        else {
            if (!hasPositive) {
                System.out.println(maxNegOdd);
            }
            
            else {
                int option1 = (minPosOdd != Integer.MAX_VALUE) ? sumPos - minPosOdd : Integer.MIN_VALUE;
                int option2 = (maxNegOdd != Integer.MIN_VALUE) ? sumPos + maxNegOdd : Integer.MIN_VALUE;
                System.out.println(Math.max(option1, option2));
            }
        }
    }
}