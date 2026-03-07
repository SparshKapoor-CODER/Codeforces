import java.util.Arrays;
import java.util.Scanner;

public class MaximumMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Sort the array so the median is at index n / 2
        Arrays.sort(a);
        
        int medianIndex = n / 2;
        long low = a[medianIndex];
        long high = a[medianIndex] + k; // The absolute maximum possible median
        long ans = low;
        
        // Binary search for the maximum possible median
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (canAchieveMedian(a, mid, k, medianIndex)) {
                ans = mid;       // This median is possible, record it
                low = mid + 1;   // Try to find a larger one
            } else {
                high = mid - 1;  // This median costs too much, aim lower
            }
        }
        
        System.out.println(ans);
        
        scanner.close();
    }
    
    // Helper function to check if we can reach targetMedian within k operations
    private static boolean canAchieveMedian(int[] a, long targetMedian, long k, int medianIndex) {
        long operationsNeeded = 0;
        
        // We only care about the median and elements to its right
        for (int i = medianIndex; i < a.length; i++) {
            if (a[i] < targetMedian) {
                operationsNeeded += (targetMedian - a[i]);
            }
            
            // Early exit optimization: if we exceed k, no need to keep checking
            if (operationsNeeded > k) {
                return false;
            }
        }
        
        return operationsNeeded <= k;
    }
}