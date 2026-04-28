// https://codeforces.com/problemset/problem/34/A
import java.util.Scanner;
public class Solution_34A_Reconnaissance_2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      byte n = sc.nextByte();
      short[] heights = new short[n];
      for(int i = 0 ; i < n; ++i)
        heights[i] = sc.nextShort();
      short heightdiff = Short.MAX_VALUE;
      short[] pair = new short[2];
      for(int i = 0; i < n - 1; ++i)
      {
        if(Math.abs(heights[i] - heights[i + 1]) < heightdiff)
        {
          heightdiff = (short)(Math.abs(heights[i] - heights[i + 1]));
          pair[0] = (short)(i + 1);
          pair[1] = (short)(i + 2);
        }
      }
      if(Math.abs(heights[0] - heights[n - 1]) < heightdiff)
      {
        pair[0] = 1;
        pair[1] = n;
      }
      System.out.println(pair[0] + "\t" + pair[1]);
    }
}