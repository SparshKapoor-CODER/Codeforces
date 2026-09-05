import java.util.*;
public class Prob101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int firstNonZero = -1;
            int lastFixedOne = -1;
            int bestLen = 0;
            int bestL = -1;
            int bestR = -1;

            for (int j = 0; j < n; j++) {
                if (a[j] == 1) {
                    int left = (lastFixedOne != -1) ? lastFixedOne : firstNonZero;
                    if (left == -1) left = j;

                    int len = j - left + 1;
                    if (len > bestLen) {
                        bestLen = len;
                        bestL = left;
                        bestR = j;
                    }

                    lastFixedOne = j;
                    if (firstNonZero == -1){
                        firstNonZero = j;
                    }
                }
                
                else if (a[j] == -1) {
                    int left = (lastFixedOne != -1) ? lastFixedOne : firstNonZero;

                    
                    if (left == -1){
                        left = j;
                    }

                    int len = j - left + 1;
                    if (len > bestLen) {
                        bestLen = len;
                        bestL = left;
                        bestR = j;
                    }

                    if (firstNonZero == -1){
                        firstNonZero = j;
                    }
                }
            }

            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    res[i] = 1;
                }
                
                else if (a[i] == -1) {
                    if (i == bestL || i == bestR) {
                        res[i] = 1;
                    }
                    
                    else {
                        res[i] = 0;
                    }
                } 
                
                else {
                    res[i] = 0;
                }
            }

            for (int i = 0; i < n; i++) {
                if (i > 0){
                    sb.append(' ');
                }
                sb.append(res[i]);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}