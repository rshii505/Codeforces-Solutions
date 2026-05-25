// https://codeforces.com/problemset/problem/177/A2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_177A2_Good_Matrix_Elements {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      byte n =  Byte.parseByte(br.readLine());
      int sum = 0;
      byte mid = (byte)((n + 1) / 2);
      for(byte i = 1; i <= n; ++i)
      {
        StringTokenizer inpt = new StringTokenizer(br.readLine());
        for(byte j = 1; j <= n; ++j)
        {
          if((i == j) || (i + j == n + 1) || (i == mid) || (j == mid))
            sum += Integer.parseInt(inpt.nextToken());
          else 
            inpt.nextToken();
        }
      }
      System.out.println(sum);
    }
}
