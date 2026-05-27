// https://codeforces.com/problemset/problem/214/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_214A_System_of_Equations {
    public static void main(String[] args) throws IOException {
      StringTokenizer inpt = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
      short n = Short.parseShort(inpt.nextToken());
      short m = Short.parseShort(inpt.nextToken());
      short cnt = 0;
      if(n < m)
      {
        n += m;
        m = (short)(n - m);
        n -= m;
      }
      for(short i = 0; i <= n; ++i)
      {
        for(short j = 0; j <= n; ++j)
        {
          if(i * i + j == m && i + j * j == n)
            ++cnt;
        }
      }
      System.out.println(cnt);
    }
}
