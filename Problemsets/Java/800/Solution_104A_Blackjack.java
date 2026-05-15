// https://codeforces.com/problemset/problem/104/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_104A_Blackjack {
    public static void main(String[] args) throws IOException {
      byte n = (byte)(Byte.parseByte(new BufferedReader(new InputStreamReader(System.in)).readLine()) - 10);
      System.out.println((n <= 0 || n >= 12) ? 0 : (n == 10 ? 15 : 4));
    }
}