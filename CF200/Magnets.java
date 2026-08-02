import java.util.*;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String prev = sc.nextLine();
        int groups = 1;

        for (int i = 1; i < n; i++) {
            String cur = sc.nextLine();
            if (!cur.equals(prev)) {
                groups++;
            }

            prev = cur;
        }
        System.out.println(groups);
    }
}