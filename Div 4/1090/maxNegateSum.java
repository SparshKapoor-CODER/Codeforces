import java.util.*;
public class maxNegateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[7];
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            Arrays.sort(arr);
            for (int i = 0; i < 6; i++) {
                sum += -1*arr[i];
            }
            sum += arr[6];
            System.out.println(sum);
        }
    }
}
