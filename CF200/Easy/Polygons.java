import java.util.*;
public class Polygons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 0;
        while (t-- > 0) {
            String s = sc.next();
            if(s.equalsIgnoreCase("Tetrahedron")) {
                ans += 4;
            }
            else if(s.equalsIgnoreCase("Cube")) {
                ans += 6;
            }
            else if(s.equalsIgnoreCase("Octahedron")) {
                ans += 8;
            }
            else if(s.equalsIgnoreCase("Dodecahedron")) {
                ans += 12;
            }
            else if(s.equalsIgnoreCase("Icosahedron")) {
                ans += 20;
            }
        }
        System.out.println(ans);
    }
}