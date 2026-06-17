import java.util.*;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine().trim();
        Set<Character> distinctChars = new HashSet<>();
        for (char c : username.toCharArray()) {
            distinctChars.add(c);
        }
        if (distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}