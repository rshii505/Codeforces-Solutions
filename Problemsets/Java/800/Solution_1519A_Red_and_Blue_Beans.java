// https://codeforces.com/problemset/problem/1519/A
import java.util.Scanner;
public class Solution_1519A_Red_and_Blue_Beans{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
          long r = sc.nextLong();
          long b = sc.nextLong();
          long d = 0;
          if(r > b)
          {
            d = r;
            r = b;
            b = d;
          }
          d = sc.nextLong();
          System.out.println((r * d) >= (b - r) ? "YES" : "NO");
        }
    }
}