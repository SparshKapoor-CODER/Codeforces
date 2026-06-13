import java.util.Scanner;

public class TV_show2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int maxVal = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > maxVal) maxVal = a[i];
            }

            int[] freq = new int[maxVal + 2];
            for (int v : a){
                freq[v]++;
            }
            
            int[] bit = new int[maxVal + 5];
            boolean possible = false;
            
            for (int v = maxVal; v >= 1; v--) {
                if (freq[v] == 0){
                    continue;
                }
                
                int l = v + 1;
                int r = Math.min(v + k, maxVal);
                boolean hasLosingLarger = false;
                if (l <= r) {
                    int sum = prefixSum(bit, r) - prefixSum(bit, l - 1);
                    if (sum > 0){
                        hasLosingLarger = true;
                    }
                }
                boolean B;
                if (hasLosingLarger) {
                    B = true;
                }
                else {
                    B = (freq[v] % 2 == 0);
                }
                if (B){
                    possible = true;
                }
                if (!B) {
                    add(bit, v, 1);
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
    
    private static void add(int[] bit, int idx, int delta) {
        while (idx < bit.length) {
            bit[idx] += delta;
            idx += idx & -idx;
        }
    }
    
    static int prefixSum(int[] bit, int idx) {
        int sum = 0;
        while (idx > 0) {
            sum += bit[idx];
            idx -= idx & -idx;
        }
        return sum;
    }
}