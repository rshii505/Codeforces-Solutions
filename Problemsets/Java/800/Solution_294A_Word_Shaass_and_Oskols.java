// https://codeforces.com/problemset/problem/294/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_294A_Word_Shaass_and_Oskols {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      byte n = Byte.parseByte(br.readLine());
      short[] a = new short[n];
      StringTokenizer inpt = new StringTokenizer(br.readLine());
      for(byte i = 0; i < n; ++i)
        a[i] = Byte.parseByte(inpt.nextToken());
      byte m = Byte.parseByte(br.readLine());
      while(m-- != 0)
      {
        StringTokenizer inpt1 = new StringTokenizer(br.readLine());
        byte x = Byte.parseByte(inpt1.nextToken());
        short y = Short.parseShort(inpt1.nextToken());
        if(x - 2 >= 0)
          a[x - 2] += (y - 1);
        if(x < n)
          a[x] += (a[x - 1] - y);
        a[x - 1] = 0;
      }
      for(short i : a)
        System.out.println(i);
    }
}
