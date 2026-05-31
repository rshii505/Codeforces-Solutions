// https://codeforces.com/problemset/problem/278/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_278A_Circle_Line {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      byte n = Byte.parseByte(br.readLine());
      byte[] d = new byte[n];
      short p1 = 0, p2 = 0;
      StringTokenizer inpt1 = new StringTokenizer(br.readLine());
      for(byte i = 0; i < n; ++i)
        d[i] = Byte.parseByte(inpt1.nextToken());
      StringTokenizer inpt2 = new StringTokenizer(br.readLine());
      byte s = Byte.parseByte(inpt2.nextToken());
      byte t = Byte.parseByte(inpt2.nextToken());
      if(s > t)
      {
        byte x = s;
        s = t;
        t = x;
      }
      for(byte i = s; i < t; ++i)
        p1 += d[i - 1];
      for(byte i = 0; i < s - 1; ++i)
        p2 += d[i];
      for(byte i = t; i <= n; ++i)
        p2 += d[i - 1];
      System.out.println(p1 < p2 ? p1 : p2);
    }
}
