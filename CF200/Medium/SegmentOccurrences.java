import java.util.*;
public class SegmentOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        
        String s = sc.next();
        String t = sc.next();
        
        int[] occ = new int[n + 2];
        
        for (int i = 1; i <= n - m + 1; i++) {
            if (s.substring(i - 1, i - 1 + m).equals(t)) {
                occ[i] = 1;
            }
        }
        
        
        int[] pref = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + occ[i];
        }
        
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            int end = r - m + 1;
            
            if (end < l) {
                out.append("0\n");
            }
            
            else {
                int ans = pref[end] - pref[l - 1];
                out.append(ans).append('\n');
            }
        }
        
        System.out.print(out);
    }
}