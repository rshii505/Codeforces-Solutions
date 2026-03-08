// https://codeforces.com/problemset/problem/1475/A
import java.util.Scanner;
public class Solution_1475A_Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            /**
            
            idk why this one is not working, please help
            
            double n = Math.log(sc.nextLong())/Math.log(2);
            System.out.println((n != (int)(n) ? "YES" : "NO");
            
            */
            
            long n = sc.nextLong();
            System.out.println((n & (n - 1)) != 0 ? "YES" : "NO");
        }
    }
}
