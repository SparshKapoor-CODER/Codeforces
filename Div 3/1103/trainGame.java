import java.util.*;
public class trainGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int h[] = new int[n];
            h[0] = sc.nextInt();
            int maxH = h[0];
            int minH = h[0];

            for(int i = 1; i < n; i++) {
                h[i] = sc.nextInt();

                if(h[i] > maxH) {
                    maxH = h[i];
                }

                if(h[i] < minH) {
                    minH = h[i];
                }
            }
            System.out.println(maxH - minH + 1);
        }   
    }
}