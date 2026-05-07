// https://codeforces.com/problemset/problem/52/A
import java.util.Scanner;
public class Solution_52A_123_sequence {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.nextLine();
      String nums[] = sc.nextLine().split(" ");
      int one, two, thr;
      one = two = thr = 0;
      for(int i = 0; i < nums.length; ++i)
      {
        int t = Integer.parseInt(nums[i]);
        if(t == 1) ++one;
        else if(t == 2) ++two;
        else if(t == 3) ++ thr;
      }
      System.out.println(n - Math.max(one, Math.max(two, thr)));
    }
}