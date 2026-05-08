// https://codeforces.com/problemset/problem/52/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_52A_123_sequence {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      StringTokenizer nums = new StringTokenizer(br.readLine());
      int one, two, thr;
      one = two = thr = 0;
      for(int i = 0; i < n; ++i)
      {
        int t = Integer.parseInt(nums.nextToken());
        if(t == 1) ++one;
        else if(t == 2) ++two;
        else if(t == 3) ++ thr;
      }
      System.out.println(n - Math.max(one, Math.max(two, thr)));
    }
}
