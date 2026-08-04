import java.util.*;
public class Riptide{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int tokans[] = new int[3];

            for(int i=0; i<3; i++){
                tokans[i] = sc.nextInt();
            }

            int c = 0;

            Arrays.sort(tokans);

            while(tokans[0] < tokans[1] && tokans[1] < tokans[2]){
                c++;
                tokans[0]++;
                tokans[2]--;
                Arrays.sort(tokans);
            }

            System.out.println(c);
        }
    }
}