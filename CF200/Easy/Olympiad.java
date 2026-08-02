import java.util.*;
public class Olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] talent = new int[n];

        for (int i = 0; i < n; i++) {
            talent[i] = sc.nextInt();
        }

        ArrayList<Integer> programmers = new ArrayList<>();
        ArrayList<Integer> mathematicians = new ArrayList<>();
        ArrayList<Integer> sportsmen = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            switch (talent[i]) {
                case 1:
                    programmers.add(i + 1);
                    break;
                case 2:
                    mathematicians.add(i + 1);
                    break;
                case 3:
                    sportsmen.add(i + 1);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        int w = Math.min(programmers.size(), Math.min(mathematicians.size(), sportsmen.size()));

        System.out.println(w);

        for (int i = 0; i < w; i++) {
            System.out.println(programmers.get(i) + " " + mathematicians.get(i) + " " + sportsmen.get(i));
        }
    }
}