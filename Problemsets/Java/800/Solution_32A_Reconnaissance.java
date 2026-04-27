// https://codeforces.com/problemset/problem/32/A
import java.util.Scanner;
public class Solution_32A_Reconnaissance {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      short n = sc.nextShort();
      int d = sc.nextInt();
      int cnt = 0;
      int[] heights = new int[n];
      for(short i = 0; i < n; ++i)
        heights[i] = sc.nextInt();
      for(short i = 0; i < n; ++i)
      {
        for(short j = 0; j < n; ++j)
        {
          if(i == j)
            continue;
          if((heights[i] - heights[j] <= d) && (heights[j] - heights[i] <= d))
            ++cnt;
        }
      }
      System.out.println(cnt);
    }
}