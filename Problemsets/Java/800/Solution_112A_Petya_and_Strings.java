// https://codeforces.com/problemset/problem/112/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_112A_Petya_and_Strings {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s1 = br.readLine().toUpperCase();
      String s2 = br.readLine().toUpperCase();
      byte x = (byte)(s1.compareTo(s2));
      System.out.println(x == 0 ? 0 : (x < 0 ? -1 : 1));
    }
}