import java.util.Scanner;

public class CircleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int k = sc.nextInt();
            
            int d = Math.abs(x1 - x2);
            d = Math.min(d, n - d);
            
            if (n == 2 || n == 3) {
                sb.append("1\n");
            } else {
                sb.append(d + k).append("\n");
            }
        }
        System.out.print(sb);
    }
}