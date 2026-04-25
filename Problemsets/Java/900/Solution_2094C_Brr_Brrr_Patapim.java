// https://codeforces.com/problemset/problem/2094/C
import java.util.Scanner;
public class Solution_2094C_Brr_Brrr_Patapim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
          int n = sc.nextInt();
          short[] pass = new short[2 * n];
          int sum = 0;
          for(int i = 0; i < n; ++i)
          {
            for(int j = 0; j < n; ++j)
            {
              short x = sc.nextShort();
              if(pass[i + j + 1] == 0)
              {
                pass[i + j + 1] = x;
                sum += x;
              }
            }
          }
          n = 2 * n;
          pass[0] = (short)(((n * (n + 1)) / 2) - sum);
          for(short i : pass)
            System.out.print(i + " ");
          System.out.println();
        }
        
    }
}