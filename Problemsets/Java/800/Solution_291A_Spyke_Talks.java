// https://codeforces.com/problemset/problem/291/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Solution_291A_Spyke_Talks {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      short n = Short.parseShort(br.readLine());
      int[] id = new int[n];
      short i = 0;
      StringTokenizer inpt = new StringTokenizer(br.readLine());
      for(; i < n; ++i)
        id[i] = Integer.parseInt(inpt.nextToken());
      Arrays.sort(id);
      short cnt = 0;
      for(i -= 1; i >= 0; --i)
      {
        if(id[i] == 0)
          break;
        if(i - 1 >= 0)
        {
          if(id[i - 1] == id[i])
          {
            if(i - 2 >= 0)
            {
              if(id[i - 2] == id[i - 1])
              {
                cnt = -1;
                break;
              }
            }
            ++cnt;
            --i;
          }
        }
      }
      System.out.println(cnt);
    }
}
