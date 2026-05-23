// https://codeforces.com/problemset/problem/172/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_172A_Phone_Code {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      short n = Short.parseShort(br.readLine());
      String s1 = br.readLine();
      byte cnt = (byte)(s1.length());
      while(--n != 0)
      {
        String sx = br.readLine();
        while(true)
        {
          if(s1.substring(0, cnt).equals(sx.substring(0, cnt)))
            break;
          --cnt;
        }
      }
      System.out.println(cnt);
    }
}
