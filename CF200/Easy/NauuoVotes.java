import java.util.*;
public class NauuoVotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextLong();
        sum -= sc.nextLong();
        long z = sc.nextLong();

        if(sum + z < 0) {
            System.out.println("-");
        }
        else if(sum - z > 0) {
            System.out.println("+");
        }
        else if(sum + z == 0 && sum - z == 0) {
            System.out.println("0");
        }
        else {
            System.out.println("?");
        }
    }
}