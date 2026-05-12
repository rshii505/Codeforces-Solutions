// https://codeforces.com/problemset/problem/92/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_92A_Chips {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer inpt = new StringTokenizer(br.readLine());
      byte n = Byte.parseByte(inpt.nextToken());
      short m = Short.parseShort(inpt.nextToken());
      System.out.println(chips(n, m));
    }
    static short chips(byte n, short m)
    {
      short sum = (short)((n * (n + 1)) / 2);
      while(true)
      {
        if(m >= sum)
        {
          m -= sum;
          continue;
        }
        break;
      }
      for(byte i = 1; i <= n; ++i)
      {
        if(m >= i)
          m -= i;
        else
          break;
      }
      return m;
    }
}