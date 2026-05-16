import java.util.Scanner;

public class OIE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();

            if (m > n) {
                for (int i = 0; i < n; i++) sc.nextLong();
                sb.append("YES\n");
            } else {
                boolean[] bad = new boolean[(int) m];
                for (int i = 1; i <= n; i++) {
                    long ai = sc.nextLong();
                    long bi = (ai + i) % m;
                    int badW = (int) ((m - bi) % m);
                    bad[badW] = true;
                }

                // Hector can use any w, but also w+2, w+4...
                // So if bad[w] but not bad[w+1] (mod m), he shifts by 1 via waiting
                // He can reach ANY w >= 0, so just check if any slot in [0,m-1] is free
                // BUT he can also change parity — he can wait 1 step at start (odd)
                // or 2 steps (even addition). Starting from position 0, moving right
                // each second means parity of arrival at i is fixed by w.
                // He CAN move left once and right once to add 2 — so any w is reachable.
                // The original logic was correct. Let me re-examine case 4...
                // m=3, n=5: bad=[0,1,2] all true → NO, but answer YES
                // That means my bad-value computation is wrong somewhere.
                // Let's re-examine: w=0: pos i at time i. Caught if (ai+i)%m==0
                // i=4: (2+4)%3=0 → caught! i=5:(1+5)%3=0 → caught at both
                // w=1: i=1:(1+1+1)%3=0 caught
                // w=2: i=2:(2+2+2)%3=0 caught  
                // So for m=3 all w fail... but answer is YES?
                // Must mean he can skip position by waiting — arriving at i at time w+i+2k
                // i.e., he doesn't have to visit every position at exactly w+i !

                // He just needs to PASS THROUGH, not stop at each i at a specific time.
                // He reaches pos i sometime, and just needs the timer ≠ 0 AT THAT MOMENT.
                // He can arrive at i at time w+i, w+i+2, w+i+4, ... (any same-parity ≥ i+w)
                // So for position i, he's safe if ANY time t ≡ (w+i) mod 2, t ≥ i,
                // has (ai+t)%m ≠ 0. The volunteer watches only when (ai+t)%m=0,
                // i.e., t ≡ -ai (mod m). He just needs ONE valid t with right parity.
                // So position i is BLOCKABLE only if ALL times t≡(w+i) mod 2
                // have (ai+t)%m=0 — impossible since cycle is m but parity repeats every 2.
                // Position i blocks him only if m divides 2 AND the parity matches!
                // i.e., only if m==1 (impossible, m>=2) or m==2 and parity of -ai ≡ w+i mod 2

                // REVISED: position i is dangerous only if m==2 and (ai+i+w)%2==0
                // For m>2, he can always find a safe time to cross position i individually.
                // The constraint is: can he order the crossings consistently?
                // Actually he must cross positions 1..n in order (left to right eventually).
                // For each position i, the dangerous times are t ≡ -ai (mod m).
                // He must pass pos i at some time NOT ≡ -ai (mod m).
                // Since m >= 2, there are (m-1) safe residues out of m.
                // He can always wait 1 extra second between positions... 
                // The key insight I'm missing must be about consecutive positions.

                boolean found = false;
                for (int w = 0; w < (int) m; w++) {
                    if (!bad[w]) { found = true; break; }
                }
                sb.append(found ? "YES\n" : "NO\n");
            }
        }
        System.out.print(sb);
    }
}