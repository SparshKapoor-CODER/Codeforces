import java.util.*;
public class Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            int minAnimals = (n + 3) / 4;
            System.out.println(minAnimals);
        }
    }
}

/*
Chicken have 2 legs
Cow have 4 legs
there are only chickens and cows
there are n legs in total
find the minimum number of animals
*/



/**
 * Explanation:
 *
 * To minimize the number of animals, we should maximize the number of cows, since cows have more legs.
 * Each cow has 4 legs, so we can fit as many cows as possible into the total number of legs.
 * If there are leftover legs that cannot form a complete cow (i.e., 1, 2, or 3 legs),  
 *  we need to add one more animal (a chicken) to account for those legs.
 * Therefore, the formula to calculate the minimum number of animals is:
 * Thus, the formula (n + 3) / 4 effectively rounds up the division of n by 4, giving us the minimum number of animals needed.
 *
 */