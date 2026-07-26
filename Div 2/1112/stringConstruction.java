import java.util.*;
public class stringConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            if (k > n - 2) {
                out.append("-1\n");
                continue;
            }
            
            int R = n - k;
            boolean found = false;
            
            
            outer:
            for (int start = 0; start <= 1; start++) {
                int init0, init1;
                if (start == 0) {
                    init0 = (R + 1) / 2; 
                    init1 = R / 2;       
                }
                
                else {
                    init1 = (R + 1) / 2;
                    init0 = R / 2;
                }
                
                
                for (int a = 0; a <= k; a++) {
                    int b = k - a;
                    int c0 = init0 + a;
                    int c1 = init1 + b;
                    if (Math.abs(c0 - c1) <= 1) {
                        
                        int[] lengths = new int[R];
                        Arrays.fill(lengths, 1);
                        
                        
                        int first0 = -1, first1 = -1;
                        for (int i = 0; i < R; i++) {
                            int ch = (start + i) % 2;
                            if (ch == 0 && first0 == -1){
                                first0 = i;
                            }

                            if (ch == 1 && first1 == -1){
                                first1 = i;
                            }
                        }
                        lengths[first0] += a;
                        lengths[first1] += b;
                        
                        
                        StringBuilder cur = new StringBuilder();
                        for (int i = 0; i < R; i++) {
                            char c = (char) ('0' + ((start + i) % 2));
                            cur.append(String.valueOf(c).repeat(lengths[i]));
                        }
                        out.append(cur).append("\n");
                        found = true;
                        break outer;
                    }
                }
            }
            
            if (!found) {
                out.append("-1\n");
            }
        }
        System.out.print(out);
    }
}