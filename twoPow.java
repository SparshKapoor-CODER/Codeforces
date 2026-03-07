import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements
        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        
        long ans = 0;
        // HashMap to store the frequencies of the numbers we've seen so far
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            
            // Check all powers of 2 from 2^0 up to 2^30
            for (int p = 0; p <= 30; p++) {
                int target = (1 << p) - x;
                
                // If the required number to form a power of 2 exists in our map, 
                // add its frequency to our answer count
                if (map.containsKey(target)) {
                    ans += map.get(target);
                }
            }
            
            // Add the current number to the map for future pairings
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        // Output the final count of pairs
        System.out.println(ans);
        
        scanner.close();
    }
}