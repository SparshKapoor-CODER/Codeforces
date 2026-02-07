import java.util.*;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            String a = sc.next();
            String b = sc.next();

            int[][] pa = new int[n + 1][26];
            int[][] pb = new int[n + 1][26];

            for (int i = 0; i < n; i++) {
                
                for (int c = 0; c < 26; c++) {
                    pa[i + 1][c] = pa[i][c];
                    pb[i + 1][c] = pb[i][c];
                }

                pa[i + 1][a.charAt(i) - 'a']++;
                pb[i + 1][b.charAt(i) - 'a']++;
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                int ops = 0;
                for (int c = 0; c < 26; c++) {
                    int ca = pa[r][c] - pa[l - 1][c];
                    int cb = pb[r][c] - pb[l - 1][c];
                    if (ca > cb) {
                        ops += ca - cb;
                    }
                }

                System.out.println(ops);
            }
            
        }
    }
}