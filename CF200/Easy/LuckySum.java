import java.util.*;
public class LuckySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();

        final long LIMIT = 10_000_000_000L; // 10^10
        List<Long> lucky = new ArrayList<>();
        generateLucky(0, LIMIT, lucky);
        Collections.sort(lucky);

        long sum = 0;
        long prev = 0; 
        for (long luck : lucky) {
            
            long start = Math.max(l, prev + 1);
            long end   = Math.min(r, luck);
            if (start <= end) {
                sum += luck * (end - start + 1);
            }
            prev = luck;
            if (luck >= r){
                break;
            }
        }

        System.out.println(sum);
    }

    private static void generateLucky(long current, long limit, List<Long> list) {
        if (current > limit){
            return;
        }

        if (current > 0){
            list.add(current);
        }
        generateLucky(current * 10 + 4, limit, list);
        generateLucky(current * 10 + 7, limit, list);
    }
}