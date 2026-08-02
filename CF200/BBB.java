import java.util.*;
public class BBB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double n = (Math.log(b/(double)a))/Math.log(1.5);
        System.out.println((int)(Math.floor(n + 1e-9)) + 1);
    }
}