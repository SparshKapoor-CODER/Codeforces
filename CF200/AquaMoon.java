import java.util.*;
public class AquaMoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int sumA = 0, sumB = 0;


            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sumA += a[i];
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                sumB += b[i];
            }

            if (sumA != sumB) {
                System.out.println(-1);
                continue;
            }

            List<Integer> surplus = new ArrayList<>();
            List<Integer> deficit = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) surplus.add(i);
                else if (a[i] < b[i]) deficit.add(i);
            }

            List<String> ops = new ArrayList<>();
            int si = 0, di = 0;
            
            while (si < surplus.size() && di < deficit.size()) {
                int i = surplus.get(si);
                int j = deficit.get(di);
                ops.add((i + 1) + " " + (j + 1));   
                a[i]--;
                a[j]++;
                if (a[i] == b[i]) si++;  
                if (a[j] == b[j]) di++;   
            }

            System.out.println(ops.size());

            for (String op : ops) {
                System.out.println(op);
            }
        }
    }
}