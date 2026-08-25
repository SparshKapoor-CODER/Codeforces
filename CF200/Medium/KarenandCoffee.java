import java.util.*;
public class KarenandCoffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        
        final int MAX_TEMP = 200000;
        int[] diff = new int[MAX_TEMP + 2];
        
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            diff[l]++;
            diff[r + 1]--;
        }
        
        int[] coverage = new int[MAX_TEMP + 1];
        int current = 0;
        for (int i = 1; i <= MAX_TEMP; i++) {
            current += diff[i];
            coverage[i] = current;
        }
        
        int[] admissiblePrefix = new int[MAX_TEMP + 1];
        for (int i = 1; i <= MAX_TEMP; i++) {
            admissiblePrefix[i] = admissiblePrefix[i - 1] + (coverage[i] >= k ? 1 : 0);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = admissiblePrefix[b] - admissiblePrefix[a - 1];
            sb.append(ans).append('\n');
        }
        
        System.out.print(sb);
    }
}