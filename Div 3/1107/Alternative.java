import java.util.*;
public class Alternative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arrA = new long[n];
            long[] arrB = new long[n];

            for (int i = 0; i < n; i++){
                arrA[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                arrB[i] = sc.nextLong();
            }

            long prefA = 0, prefB = 0;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                prefA += arrA[i];
                prefB += arrB[i];
                if (prefB < prefA) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                System.out.println("YES");
            }
            
            else {
                System.out.println("NO");
            }
        }
    }
}