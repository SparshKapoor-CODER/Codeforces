import java.util.*;
public class Lawn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            
            int remove = n - (n / w);
            System.out.println(remove);
        }
    }
}

