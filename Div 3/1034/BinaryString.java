import java.util.*;
public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int ones = 0;
            int zeros = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    ones++;
                } else {
                    zeros++;
                }
            }

            if (ones <= k) {
                System.out.println("Alice");
            }

            else{
                if(2*k>n) {
                    System.out.println("Alice");
                }
                else {
                    System.out.println("Bob");
                }
            }
        }
    }
}