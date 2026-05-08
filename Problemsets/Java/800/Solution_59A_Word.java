// https://codeforces.com/problemset/problem/59/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_59A_Word {
    public static void main(String[] args) throws IOException {
      String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
      System.out.println(isUpCs(s.toCharArray()) ? s.toUpperCase() : s.toLowerCase());
    }
    static boolean isUpCs(char[] ltrs)
    {
      byte cnt = 0;
      for(char ch : ltrs)
      {
        if(ch < 91)
          ++cnt;
      }
      return cnt * 2 > ltrs.length;
    }
}
