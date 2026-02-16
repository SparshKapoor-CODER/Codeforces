import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] p = new int[n + 1];
                int[] pos = new int[n + 1];
                for (int i = 1; i <= n; i++) {
                    p[i] = sc.nextInt();
                    pos[p[i]] = i;
                }

                int[] a = new int[n + 1];
                for (int i = 1; i <= n; i++) {
                    a[i] = sc.nextInt();
                }

                boolean possible = true;
                
                int[] L = new int[n + 1];
                int[] R = new int[n + 1];
                for(int i=1; i<=n; i++) L[i] = n + 1;
                for(int i=1; i<=n; i++) {
                    L[a[i]] = Math.min(L[a[i]], i);
                    R[a[i]] = Math.max(R[a[i]], i);
                }

                int[] first = new int[n + 1];
                int[] last = new int[n + 1];
                for(int i=1; i<=n; i++) {
                    if (first[a[i]] == 0) first[a[i]] = i;
                    last[a[i]] = i;
                }

                for (int i = 1; i <= n; i++) {
                    int val = a[i];
                    int pIdx = pos[val];
                    if (i > 1 && a[i] == a[i-1]) {
                        continue; 
                    }
                    if (pIdx < L[val] || pIdx > R[val]) {
                        possible = false;
                        break;
                    }
                }
                
                int j = 1;
                for (int i = 1; i <= n; i++) {
                    if (j <= n && a[i] == p[j]) {
                        j++;
                    }
                }
                
                
                int[] b = new int[n + 1];
                int bSize = 0;
                for (int i = 1; i <= n; i++) {
                    if (i == 1 || a[i] != a[i-1]) {
                        b[++bSize] = a[i];
                    }
                }
                
                int pPtr = 1;
                int bPtr = 1;
                while (pPtr <= n && bPtr <= bSize) {
                    if (p[pPtr] == b[bPtr]) {
                        bPtr++;
                    }
                    pPtr++;
                }

                if (bPtr > bSize) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}