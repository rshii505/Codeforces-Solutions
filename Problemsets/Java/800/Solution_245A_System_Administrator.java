// https://codeforces.com/problemset/problem/245/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_245A_System_Administrator {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      short n =  Short.parseShort(br.readLine());
      short a = 0;
      short b = 0;
      while(n-- != 0)
      {
        StringTokenizer inpt = new StringTokenizer(br.readLine());
        if(Byte.parseByte(inpt.nextToken()) == 1)
          a += (short)(Byte.parseByte(inpt.nextToken()) - Byte.parseByte(inpt.nextToken()));
        else
          b += (short)(Byte.parseByte(inpt.nextToken()) - Byte.parseByte(inpt.nextToken()));
      }
      System.out.println(a < 0 ? "DEAD" : "LIVE");
      System.out.println(b < 0 ? "DEAD" : "LIVE");
    }
}
