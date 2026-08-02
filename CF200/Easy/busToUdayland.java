import java.util.*;
public class busToUdayland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] bus = new String[n];

        for(int i=0; i<n; i++){
            bus[i] = sc.next();
        }

        boolean found = false;
        for(int i=0; i<n; i++){
            if(bus[i].contains("OO")){
                System.out.println("YES");
                bus[i] = bus[i].replaceFirst("OO", "++");
                found = true;
                for(int j=0; j<n; j++){
                    System.out.println(bus[j]);
                }
                break;
            }
        }
        if(!found){
            System.out.println("NO");
        }
    }
}