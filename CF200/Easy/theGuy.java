import java.util.*;
public class theGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        boolean[] canPass = new boolean[n + 1];
        
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int level = sc.nextInt();
            canPass[level] = true;
        }
        
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int level = sc.nextInt();
            canPass[level] = true;
        }
        
        boolean allCovered = true;
        for (int i = 1; i <= n; i++) {
            if (!canPass[i]) {
                allCovered = false;
                break;
            }
        }
        
        if (allCovered) {
            System.out.println("I become the guy.");
        }
        else {
            System.out.println("Oh, my keyboard!");
        }
    }
}