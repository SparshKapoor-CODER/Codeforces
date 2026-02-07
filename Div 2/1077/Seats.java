import java.util.*;

public class Seats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                System.out.println(solve(n, s));
            }
        }
    }

    private static int solve(int n, String s) {
        int existingStudents = 0;
        int lastOneIndex = -1;
        int addedStudents = 0;

        // Iterate through the row to find existing students and calculate gaps
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                existingStudents++;
                
                if (lastOneIndex == -1) {
                    // This is the first '1' found. Handle the Start Gap (zeros before first 1).
                    // Gap size p = i (indices 0 to i-1)
                    int p = i;
                    addedStudents += p / 3;
                    if (p % 3 == 2) {
                        addedStudents++;
                    }
                } 
                else {
                    // This is an Inner Gap (zeros between two 1s).
                    // Gap size k = i - lastOneIndex - 1
                    int k = i - lastOneIndex - 1;
                    addedStudents += k / 3;
                }
                
                lastOneIndex = i;
            }
        }

        // Handle the case where the row was completely empty
        if (existingStudents == 0) {
            // Formula for empty row of size n is ceil(n / 3), which is (n + 2) / 3 in integer math
            return (n + 2) / 3;
        }

        // Handle the End Gap (zeros after the last 1)
        // Gap size q = (n - 1) - lastOneIndex
        int q = n - 1 - lastOneIndex;
        addedStudents += q / 3;
        if (q % 3 == 2) {
            addedStudents++;
        }

        // Result is existing students + minimum new students needed
        return existingStudents + addedStudents;
    }
}