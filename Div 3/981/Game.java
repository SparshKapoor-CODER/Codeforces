import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int i = 0;

            int x = 0;

            while(x>= -1*n && x<= n){
                i++;
                if(i%2==1){
                    x -= 2*i - 1;
                }

                else {
                    x += 2*i - 1;
                }
            }

            if(Math.abs(x) == x){
                System.out.println("Kosuke");
            }

            else {
                System.out.println("Sakurako");
            }
        }
    }
}