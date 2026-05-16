// https://codeforces.com/problemset/problem/110/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_110A_Nearly_Lucky_Number {
    public static void main(String[] args) throws IOException {
      long n = Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine());
      byte cnt = 0;
      while(n != 0)
      {
        if(n % 10 == 4 || n % 10 == 7) ++cnt;
        n /= 10;
      }
      System.out.println((cnt == 4 || cnt == 7) ? "YES" : "NO");
    }
}