import java.util.*;

public class greatestSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            // 1. Find all decreasing pairs and maximum D
            int D = 0;
            boolean conflict = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i+1]) {
                    D = Math.max(D, a[i] - a[i+1]);
                    // check two consecutive decreasing pairs
                    if (i > 0 && a[i-1] > a[i]) {
                        conflict = true;
                        break;
                    }
                }
            }
            if (conflict) {
                System.out.println("NO");
                continue;
            }

            // 2. Forced bits
            int[] force = new int[n];
            Arrays.fill(force, -1);
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i+1]) {
                    force[i] = 0;
                    force[i+1] = 1;
                }
            }

            // 3. Collect forced indices in order
            List<int[]> forced = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (force[i] != -1) forced.add(new int[]{i, force[i]});
            }

            boolean ok = true;
            // 4. Check each 1 -> 0 transition
            for (int idx = 0; idx < forced.size() - 1; idx++) {
                int p1 = forced.get(idx)[0];
                int v1 = forced.get(idx)[1];
                int p2 = forced.get(idx+1)[0];
                int v2 = forced.get(idx+1)[1];

                if (v1 == 1 && v2 == 0) {
                    int maxIncrease = 0;
                    for (int j = p1; j < p2; j++) { // j from p1 to p2-1
                        if (a[j] < a[j+1]) {
                            maxIncrease = Math.max(maxIncrease, a[j+1] - a[j]);
                        }
                    }
                    if (maxIncrease < D) {
                        ok = false;
                        break;
                    }
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}