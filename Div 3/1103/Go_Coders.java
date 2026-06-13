import java.util.*;
public class Go_Coders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();

            List<long[]> listA = new ArrayList<>();
            listA.add(new long[]{0, a});
            long cur = a;
            int d = 0;
            while (cur > 0) {
                cur /= x;
                d++;
                listA.add(new long[]{d, cur});
            }

            List<long[]> listB = new ArrayList<>();
            listB.add(new long[]{0, b});
            cur = b;
            d = 0;
            while (cur > 0) {
                cur /= x;
                d++;
                listB.add(new long[]{d, cur});
            }

            long best = Math.abs(a - b); 

            
            for (long[] pA : listA) {
                long d1 = pA[0];
                long A = pA[1];
                for (long[] pB : listB) {
                    long d2 = pB[0];
                    long B = pB[1];
                    long cost = d1 + d2 + Math.abs(A - B);
                    if (cost < best) {
                        best = cost;
                    }
                }
            }
            System.out.println(best);
        }
    }
}