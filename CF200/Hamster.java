import java.util.*;
public class Hamster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();   
        int K = sc.nextInt(); 
        long bestTransported = -1;
        int bestType = 1;
        long bestBoxes = 0;

        for (int i = 0; i < K; i++) {
            long a = sc.nextLong();
            long boxes = N / a;
            long transported = boxes * a;

            if (transported > bestTransported) {
                bestTransported = transported;
                bestType = i + 1;
                bestBoxes = boxes;
            }
        }

        System.out.println(bestType + " " + bestBoxes);
    }
}