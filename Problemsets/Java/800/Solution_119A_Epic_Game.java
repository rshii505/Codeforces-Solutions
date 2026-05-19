// https://codeforces.com/problemset/problem/119/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_119A_Epic_Game {
    public static void main(String[] args) throws IOException {
      StringTokenizer inpt = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
      byte a = Byte.parseByte(inpt.nextToken());
      byte b = Byte.parseByte(inpt.nextToken());
      byte n = Byte.parseByte(inpt.nextToken());
      byte gcd = 0;
      while(true)
      {
        gcd = n == 0 ? a : gcd(a, n);
        if(n - gcd < 0)
        {
          System.out.println(1);
          break;
        }
        n -= gcd;
        gcd = n == 0 ? b : gcd(b, n);
        if(n - gcd < 0)
        {
          System.out.println(0);
          break;
        }
        n -= gcd;
      }
    }
    static byte gcd(byte m, byte n)
    {
      return n == 0 ? m : gcd(n, (byte)(m % n));
    }
}
