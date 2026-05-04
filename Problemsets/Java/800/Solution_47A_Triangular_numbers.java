// https://codeforces.com/problemset/problem/47/A
import java.util.Scanner;
public class Solution_47A_Triangular_numbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      short n = sc.nextShort();
      System.out.println(isTriangular(n) ? "YES" : "NO");
    }
    static boolean isTriangular(short n)
    {
      for(short i = 1; i <= n; ++i)
      {
        if(i * (i + 1) == 2 * n)
          return true;
      }
      return false;
    }
}