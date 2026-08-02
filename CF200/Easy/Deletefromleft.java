import java.util.*;
public class Deletefromleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        int i = s.length() - 1;
        int j = t.length() - 1;
        int common = 0;

        while (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
            common++;
            i--;
            j--;
        }

        
        int moves = s.length() + t.length() - 2 * common;
        System.out.println(moves);
    }
}