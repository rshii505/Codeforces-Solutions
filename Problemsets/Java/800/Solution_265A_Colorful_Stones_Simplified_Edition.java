// https://codeforces.com/problemset/problem/265/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_265A_Colorful_Stones_Simplified_Edition {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
      String t = br.readLine();
      byte idx = 0;
      byte ins = (byte)t.length();
      for(byte i = 0; i < ins; ++i)
      {
        if(s.charAt(idx) == t.charAt(i))
          ++idx;
      }
      System.out.println(idx + 1);
    }
}
