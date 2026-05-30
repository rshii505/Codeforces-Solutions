// https://codeforces.com/problemset/problem/268/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_268A_Games {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      byte n = Byte.parseByte(br.readLine());
      byte[][] uni = new byte[n][2];
      short cnt = 0;
      for(byte i = 0; i < n; ++i)
      {
        StringTokenizer inpt = new StringTokenizer(br.readLine());
        uni[i][0] = Byte.parseByte(inpt.nextToken());
        uni[i][1] = Byte.parseByte(inpt.nextToken());
      }
      for(byte i = 0; i < n - 1; ++i)
      {
        for(byte j = (byte)(i + 1); j < n; ++j)
        {
          if(uni[i][0] == uni[j][1])
            ++cnt;
          if(uni[i][1] == uni[j][0])
            ++cnt;
        }
      }
      System.out.println(cnt);
    }
}
