// https://codeforces.com/problemset/problem/38/A
import java.util.Scanner;
public class Solution_38A_Army {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      short n = (short)(sc.nextByte() - 1);
      byte[] d = new byte[n];
      for(byte i = 0; i < n; ++i)
        d[i] = sc.nextByte();
      byte a = sc.nextByte();
      byte b = sc.nextByte();
      n = 0;
      for(byte i = (byte)(a - 1); i < b - 1; ++i)
        n += d[i];
      System.out.println(n);
    }
}