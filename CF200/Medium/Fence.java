import java.util.*;
public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        
        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += h[i];
        }

        long minSum = currentSum;
        int minIndex = 0;  

        
        for (int i = k; i < n; i++) {
            currentSum = currentSum - h[i - k] + h[i];
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i - k + 1;
            }
        }

        System.out.println(minIndex + 1);
    }
}

// $TARGET = "https://food-to-ngo-distribution-system.onrender.com"
// for ($i=0; $i -lt 1000; $i++) {
//     Start-Process -NoNewWindow -FilePath "curl.exe" -ArgumentList "-X POST `"$TARGET/signup`" -F `"name=DoS$i`" -F `"email=dos$i@attack.com`" -F `"password=pass`" -F `"role=restaurant`""
// }