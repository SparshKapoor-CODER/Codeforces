import java.util.*;
public class prime_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        
        int yesCount = 0;
        int yesPrime = -1;
        
        for (int p : primes) {
            System.out.println(p);
            System.out.flush();
            String query = sc.next();
            if (query.equals("yes")) {
                yesCount++;
                yesPrime = p;
            }
        }
        
        if (yesCount == 0) {
            System.out.println("prime");
            System.out.flush();
        }
        
        else if (yesCount >= 2) {
            System.out.println("composite");
            System.out.flush();
        }
        
        else {
            if (yesPrime * yesPrime > 100) {
                System.out.println("prime");
                System.out.flush();
            }
            
            else {
                
                System.out.println(yesPrime * yesPrime);
                System.out.flush();
                String query = sc.next();
                if (query.equals("yes")) {
                    System.out.println("composite");
                    System.out.flush();
                }
                
                else {
                    System.out.println("prime");
                    System.out.flush();
                }
            }
        }
    }
}




/**
 * Solution to the interactive guessing game where Bear Limak thinks of a hidden number
 * between 2 and 100. The program must determine whether that number is prime or composite,
 * using at most 20 queries.
 *
 * <p>Each query: print an integer q (2 &le; q &le; 100). The system responds with "yes"
 * if q divides the hidden number, or "no" otherwise. After gathering enough information,
 * the program prints "prime" or "composite" and terminates.
 *
 * <h3>Strategy</h3>
 * The solution exploits the fact that any composite number &le; 100 must have at least one
 * prime divisor &le; 10, but to cover all cases it queries <em>all</em> primes up to 50.
 * Based on the answers, three cases are distinguished:
 * <ol>
 *   <li><b>0 "yes" replies:</b> No queried prime divides the number. This implies the
 *       number is a prime larger than 50 (since all numbers &le; 100 that are composite
 *       have at least one prime factor &le; 50). Output <i>prime</i>.</li>
 *   <li><b>2 or more "yes" replies:</b> The number is divisible by at least two distinct
 *       primes, therefore it must be composite. Output <i>composite</i>.</li>
 *   <li><b>Exactly 1 "yes" reply</b> for some prime {@code p}:
 *     <ul>
 *       <li>If {@code p} &ge; 11, then {@code p*p > 100}, so the hidden number cannot be
 *           a higher power of {@code p}; it must be the prime {@code p} itself. Output
 *           <i>prime</i>.</li>
 *       <li>If {@code p} &le; 10 (i.e., p = 2, 3, 5, 7), the number could be {@code p}
 *           itself or a composite power like {@code p}<sup>2</sup>, {@code p}<sup>3</sup>, …
 *           To decide, one extra query is made with {@code p*p}. A "yes" answer indicates
 *           a composite power; otherwise it is the prime {@code p}.</li>
 *     </ul>
 *   </li>
 * </ol>
 * The total number of queries is at most 15 (primes up to 50) + 1 (square check) = 16,
 * safely within the allowed limit of 20.
 *
 * <p>Note: The program reads exactly 15 answers even if a decision could be made earlier;
 * this is harmless and keeps the interaction simple.
 */
