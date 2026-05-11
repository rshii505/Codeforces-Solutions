// https://codeforces.com/problemset/problem/80/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_80A_Panoramixs_Prediction {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer inpt = new StringTokenizer(br.readLine());
      byte n = Byte.parseByte(inpt.nextToken());
      byte m = Byte.parseByte(inpt.nextToken());
      System.out.println(nxtPrm(n) == m ? "YES" : "NO");
    }
    static byte nxtPrm(byte n)
    {
      ++n;
      for(byte i = 2; i < n; ++i)
      {
        if(n % i == 0)
        {
          i = 2;
          ++n;
        }
      }
      return n;
    }
}