// https://codeforces.com/problemset/problem/266/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_266A_Stones_on_the_Table {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      byte n = Byte.parseByte(br.readLine());
      String s = br.readLine();
      byte cnt = 0;
      for(byte i = 1; i < n; ++i)
      {
        if(s.charAt(i - 1) == s.charAt(i))
        {
          ++cnt;
          s = s.substring(0, i) + s.substring(i + 1);
          --i;
          --n;
        }
      }
      System.out.println(cnt);
    }
}
