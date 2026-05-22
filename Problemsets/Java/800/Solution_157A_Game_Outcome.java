// https://codeforces.com/problemset/problem/157/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_157A_Game_Outcome {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      byte n = Byte.parseByte(br.readLine());
      byte[][] num = new byte[n][n];
      short[][] sum = new short[2][n];
      for(byte i = 0; i < n; ++i)
      {
        StringTokenizer inpt = new StringTokenizer(br.readLine());
        for(byte j = 0; j < n; ++j)
        {
          byte x = Byte.parseByte(inpt.nextToken());
          num[i][j] = x;
          sum[0][i] += x;
          sum[1][j] += x;
          
        }
      }
      short cnt = 0;
      for(byte i = 0; i < n; ++i)
      {
        for(byte j = 0; j < n; ++j)
        {
          if(sum[1][j] > sum[0][i])
            ++cnt;
        }
      }
      System.out.println(cnt);
    }
}
