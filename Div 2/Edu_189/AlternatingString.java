import java.util.*;

public class AlternatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s, 'a') || check(s, 'b')) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
    }

    // Checks if the set of positions where s differs from the alternating string
    // starting with `startChar` forms a contiguous block (or is empty).
    private static boolean check(String s, char startChar) {
        List<Integer> mismatches = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char expected = (i % 2 == 0) ? startChar : (startChar == 'a' ? 'b' : 'a');
            if (s.charAt(i) != expected) {
                mismatches.add(i);
            }
        }
        if (mismatches.isEmpty()) {
            return true; // already alternating
        }
        int first = mismatches.get(0);
        int last = mismatches.get(mismatches.size() - 1);
        // The mismatches are contiguous if their count equals the span length.
        return (last - first + 1) == mismatches.size();
    }
}