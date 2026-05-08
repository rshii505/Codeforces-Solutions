// https://codeforces.com/problemset/problem/63/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_63A_Sinking_Ship {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      byte n = Byte.parseByte(br.readLine());
      String[] names = new String[n];
      byte[] sts = new byte[n];
      for(byte i = 0; i < n; ++i)
      {
        StringTokenizer tkn = new StringTokenizer(br.readLine());
        names[i] = tkn.nextToken();
        char ch = tkn.nextToken().charAt(2);
        sts[i] = (byte)(ch == 't' ? 0 : (ch == 'n' ? 2 : (ch == 'p' ? 3 : 1)));
      }
      for (byte i = 1; i < n; ++i)
      {
        byte key = sts[i];
        String val = names[i];
        byte j = (byte)(i - 1);
        while (j >= 0 && sts[j] > key)
        {
          sts[j + 1] = sts[j];
          names[j + 1] = names[j];
          --j;
        }
        sts[j + 1] = key;
        names[j + 1] = val;
      }
      for(String name : names)
        System.out.println(name);
    }
}