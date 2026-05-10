// https://codeforces.com/problemset/problem/78/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_78A_Haiku {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      boolean haiku = true;
      byte cnt = 0;
      StringTokenizer phrs1 = new StringTokenizer(br.readLine());
      while (phrs1.hasMoreTokens())
      {
        String x = phrs1.nextToken();
        byte len = (byte)(x.length());
        while(len-- != 0)
        {
          if("aeiou".indexOf(x.charAt(len)) != -1)
            ++cnt;
        }
      }
      if(cnt != 5)
        haiku = false;
      if(haiku)
      {
        cnt = 0;
        phrs1 = new StringTokenizer(br.readLine());
        while (phrs1.hasMoreTokens())
        {
          String x = phrs1.nextToken();
          byte len = (byte)(x.length());
          while(len-- != 0)
          {
            if("aeiou".indexOf(x.charAt(len)) != -1)
              ++cnt;
          }
        }
        if(cnt != 7)
          haiku = false;
      }
      else
      {
        br.readLine();
        br.readLine();
      }
      if(haiku)
      {
        cnt = 0;
        phrs1 = new StringTokenizer(br.readLine());
        while (phrs1.hasMoreTokens())
        {
          String x = phrs1.nextToken();
          byte len = (byte)(x.length());
          while(len-- != 0)
          {
            if("aeiou".indexOf(x.charAt(len)) != -1)
              ++cnt;
          }
        }
        if(cnt != 5)
          haiku = false;
      }
      else
        br.readLine();
      System.out.println(haiku ? "YES" : "NO");
    }
}