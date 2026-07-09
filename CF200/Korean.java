import java.util.*;
public class Korean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currTime = sc.next(); 

  
        int currHour = Integer.parseInt(currTime.substring(0, 2));
        int currMin = Integer.parseInt(currTime.substring(3));

        
        String hourStr = String.format("%02d", currHour);
        String palMinStr = new StringBuilder(hourStr).reverse().toString();
        int palMinCurr = Integer.parseInt(palMinStr);

        
        if (currMin == palMinCurr) {
            System.out.println(0);
            return;
        }

        
        int nextHour = -1, nextMin = -1;
        for (int h = currHour; h <= 23; h++) {
            String hStr = String.format("%02d", h);
            String pMinStr = new StringBuilder(hStr).reverse().toString();
            int pMin = Integer.parseInt(pMinStr);

            if (h > currHour || (h == currHour && pMin > currMin)) {
                nextHour = h;
                nextMin = pMin;
                break;
            }
        }

       
        if (nextHour == -1) {
            nextHour = 0;
            nextMin = 0;
        }

        int currTotal = currHour * 60 + currMin;
        int nextTotal = nextHour * 60 + nextMin;
        int diff = nextTotal - currTotal;

        if (diff < 0){
            diff += 24 * 60;  
        }

        
        System.out.println(diff);
    }
}