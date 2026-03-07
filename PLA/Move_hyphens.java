import java.util.*;
public class Move_hyphens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder();
        StringBuilder hyphens = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                hyphens.append(str.charAt(i));
            }
            else{
                s.append(str.charAt(i));
            }
        }

        System.out.println(s.toString() + hyphens.toString());
    }
}