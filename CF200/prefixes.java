import java.util.*;
public class prefixes {
    static final int MAX = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        long[] lengths = new long[m];
        int[] opType = new int[m];
        int[] opX = new int[m];
        int[] opL = new int[m];
        int[] opC = new int[m];

        int[] seq = new int[MAX + 1];
        long currentLength = 0;

        for (int i = 0; i < m; i++) {
            int type = sc.nextInt();
            opType[i] = type;

            if (type == 1) {
                int x = sc.nextInt();
                opX[i] = x;
                currentLength++;
                if (currentLength <= MAX) {
                    seq[(int) currentLength] = x;
                }
            }
            else {
                int l = sc.nextInt();
                int c = sc.nextInt();
                opL[i] = l;
                opC[i] = c;

                long added = (long) l * c;
                if (currentLength < MAX) {
                    long need = Math.min(added, MAX - currentLength);
                    for (long j = 0; j < need; j++) {
                        seq[(int) (currentLength + 1 + j)] = seq[(int) (1 + (j % l))];
                    }
                }
                currentLength += added;
            }
            lengths[i] = currentLength;
        }

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            long pos = sc.nextLong();
            int ans;

            if (pos <= MAX) {
                ans = seq[(int) pos];
            }
            else {
                int ip = Arrays.binarySearch(lengths, pos);
                int opIdx = (ip >= 0) ? ip : -ip - 1;

                if (opType[opIdx] == 1) {
                    ans = opX[opIdx];
                }
                else {
                    long prevLen = (opIdx == 0) ? 0 : lengths[opIdx - 1];
                    long offset = pos - prevLen - 1;
                    int l = opL[opIdx];
                    long idxInPrefix = (offset % l) + 1;
                    ans = seq[(int) idxInPrefix];
                }
            }

            sb.append(ans);
            if (i < n - 1) sb.append(' ');
        }

        System.out.println(sb.toString());
    }
}