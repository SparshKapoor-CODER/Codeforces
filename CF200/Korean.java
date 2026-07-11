import java.util.*;
public class Korean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3));

        int minutesSlept = 0;
        while (true) {
            String hh = String.format("%02d", h);
            String mm = String.format("%02d", m);
            String full = hh + mm;  
            String rev = new StringBuilder(full).reverse().toString();

            if (full.equals(rev)) {
                System.out.println(minutesSlept);
                return;
            }

            
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
            minutesSlept++;
        }
    }
}