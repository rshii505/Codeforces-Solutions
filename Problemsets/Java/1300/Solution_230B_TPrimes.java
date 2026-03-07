// https://codeforces.com/problemset/problem/230/B
import java.util.Scanner;
public class Solution_230B_TPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- != 0)
        {
            long x = sc.nextLong();
            double sqrt = Math.sqrt(x);
            if(sqrt == (int)(sqrt))
                System.out.println(isPrime((int)(sqrt)) ? "YES" : "NO");
            else
                System.out.println("NO");
        }
    }
    static boolean isPrime(int n)
    {
        if(n <= 1)
            return false;
        int sqrt = (int)(Math.sqrt(n));
        for(int i = 2; i <= sqrt; ++i)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}