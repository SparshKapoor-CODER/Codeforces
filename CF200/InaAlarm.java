import java.util.*;
public class InaAlarm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] xPresent = new boolean[101];
        boolean[] yPresent = new boolean[101];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xPresent[x] = true;
            yPresent[y] = true;
        }

        int distinctX = 0, distinctY = 0;

        for (int i = 0; i <= 100; i++) {
            if (xPresent[i]) {
                distinctX++;
            }

            if (yPresent[i]) {
                distinctY++;
            }
        }
        System.out.println(Math.min(distinctX, distinctY));
    }
}