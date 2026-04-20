// https://codeforces.com/problemset/problem/1506/A
import java.util.Scanner;
public class Solution_1506A_Strange_Table {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long x = sc.nextLong();
            long j = (long)Math.ceil(x * 1.0 / n);
            long i = (x % n) == 0 ? n : x % n;
            System.out.println(((i - 1) * m) + j);
            
            // one liner, if you will :)
            // System.out.println(((((x % n) == 0 ? n : x % n) - 1) * m) + ((long)Math.ceil(x * 1.0 / n)));
        }
    }
}