import java.util.*;;
public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String a = sc.next();  // String to change
            int m = sc.nextInt();
            String b = sc.next();   // String from which we need to take characters
            String c = sc.next();   // DVDVDVDV

            // Convert a to StringBuilder for easier manipulation
            StringBuilder result = new StringBuilder(a);

            for (int i = 0;i<m;i++){
                char person = c.charAt(i);
                char charToTake = b.charAt(i);

                if(person == 'D'){
                    // put charToTake in the end of result
                    result.append(charToTake);
                }else{
                    // put charToTake in the beginning of result
                    result.insert(0, charToTake);
                }
            }
            System.out.println(result.toString());
        }
    }
}