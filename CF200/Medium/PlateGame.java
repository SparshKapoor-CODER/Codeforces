import java.util.*;
public class PlateGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        
        if (2 * r <= a && 2 * r <= b) {
            System.out.println("First");
        }
        else {
            System.out.println("Second");
        }
    }
}