// https://codeforces.com/problemset/problem/155/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_155A_I_love_username {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      short n = Short.parseShort(br.readLine());
      short min, max, cnt = 0;
      StringTokenizer inpt = new StringTokenizer(br.readLine());
      min = max = Short.parseShort(inpt.nextToken());
      while(--n != 0)
      {
        short x = Short.parseShort(inpt.nextToken());
        if(x > max)
        {
          ++cnt;
          max = x;
        }
        else if(x < min)
        {
          ++cnt;
          min = x;
        }
      }
      System.out.println(cnt);
    }
}
