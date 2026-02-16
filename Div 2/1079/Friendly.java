import java.util.*;
public class Friendly
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int c = 0;
            int x = sc.nextInt();

            for(int y = x+1; y < x + 100; y++)
            {
                if(y - SumOfDigits(y) == x){
                    c++;
                }
            }
            System.out.println(c);
        }
    }

    public static int SumOfDigits(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}