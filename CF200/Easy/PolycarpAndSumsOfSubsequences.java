import java.util.*;
public class PolycarpAndSumsOfSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] b = new int[7];
            for (int i = 0; i < 7; i++) {
                b[i] = sc.nextInt();
            }
            int a1 = b[0];
            int a2 = b[1];
            int a3 = b[6] - a1 - a2;
            System.out.println(a1 + " " + a2 + " " + a3);
        }
    }
}