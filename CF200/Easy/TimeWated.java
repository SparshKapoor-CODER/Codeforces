import java.util.*;
public class TimeWated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cods[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            cods[i][0] = sc.nextInt();
            cods[i][1] = sc.nextInt();
        }

        double totalLength = 0.0;
        for (int i = 1; i < n; i++) {
            double dx = cods[i][0] - cods[i - 1][0];
            double dy = cods[i][1] - cods[i - 1][1];
            totalLength += Math.sqrt(dx * dx + dy * dy); // Calculate the distance between consecutive points and add to total length
        }

        double time = totalLength * k / 50.0; 
        System.out.printf("%.10f\n", time);
    }
}