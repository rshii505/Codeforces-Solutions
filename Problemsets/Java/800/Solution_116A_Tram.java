// https://codeforces.com/problemset/problem/116/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_116A_Tram {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      short n = Short.parseShort(br.readLine());
      int cnt = 0, max = 0;
      while(n-- != 0)
      {
        StringTokenizer inpt = new StringTokenizer(br.readLine());
        cnt = cnt - Integer.parseInt(inpt.nextToken()) + Integer.parseInt(inpt.nextToken());
        if(cnt > max)
          max = cnt;
      }
      System.out.println(max);
    }
}
