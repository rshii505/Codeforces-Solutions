// https://codeforces.com/problemset/problem/22/A
import java.util.Scanner;
public class Solution_22A_Second_Order_Statistics {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      byte n = sc.nextByte();
      byte[] stats = new byte[n];
      for(int i = 0; i < n; ++i)
        stats[i] = sc.nextByte();
      for (byte i = 0; i < n; ++i)
      {
        byte idx = i;
        for (byte j = (byte)(i + 1); j < n; ++j)
        {
          if (stats[j] < stats[idx])
              idx = j;
        }
        byte x = stats[idx];
        stats[idx] = stats[i];
        stats[i] = x;
      }
      boolean yes = false;
      byte x = stats[0];
      for(int i = 1; i < n; ++i)
      {
        if(x < stats[i])
        {
          yes = true;
          x = stats[i];
          break;
        }
      }
        System.out.println(yes ? x : "NO");
    }
}