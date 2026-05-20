// https://codeforces.com/problemset/problem/146/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_146A_Lucky_Ticket {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      byte n = Byte.parseByte(br.readLine());
      String num = br.readLine();
      if(num.replace("4", "").replace("7", "").length() != 0)
        System.out.println("NO");
      else if(sum(num.substring(0, n/2), 0) != sum(num.substring(n/2), 0))
        System.out.println("NO");
      else
        System.out.println("YES");
    }
    static int sum(String s, int n)
    {
      byte x = (byte)(s.length());
      for(byte i = 0; i < x; ++i)
        n += (s.charAt(i) == '4' ? 4 : 7);
      return n;
    }
}
