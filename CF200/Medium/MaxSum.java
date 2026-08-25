import java.util.*;
public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        String s = Long.toString(n);
        int len = s.length();

        int trailing9 = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '9') {
                trailing9++;
            } else {
                break;
            }
        }

        long digitSum = 0;
        for (int i = 0; i < len; i++) {
            digitSum += s.charAt(i) - '0';
        }

        long carries = 0;
        if (trailing9 < len) {
            carries = len - 1 - trailing9;
        }

        long answer = digitSum + 9 * carries;
        System.out.println(answer);
    }
}