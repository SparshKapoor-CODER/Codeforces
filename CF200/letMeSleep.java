import java.util.*;
public class letMeSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currTime = sc.next();
        String[] parts = currTime.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        String duration = sc.next();
        String[] durationParts = duration.split(":");
        int durationHours = Integer.parseInt(durationParts[0]);
        int durationMinutes = Integer.parseInt(durationParts[1]);

        
        int totalMinutes = hours * 60 + minutes;
        int totalDurationMinutes = durationHours * 60 + durationMinutes;
        int sleepTimeMinutes = totalMinutes - totalDurationMinutes;

        if (sleepTimeMinutes < 0) {
            sleepTimeMinutes += 24 * 60; 
        }

        int sleepHours = sleepTimeMinutes / 60;
        int sleepMinutes = sleepTimeMinutes % 60;

        System.out.printf("%02d:%02d\n", sleepHours, sleepMinutes);
    }
}