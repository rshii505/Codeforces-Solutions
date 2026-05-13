// https://codeforces.com/problemset/problem/96/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_96A_Football {
    public static void main(String[] args) throws IOException {
      String plyrs = new BufferedReader(new InputStreamReader(System.in)).readLine ();
      System.out.println((plyrs.indexOf("0000000") != -1 || plyrs.indexOf("1111111") != -1) ? "YES" : "NO");
    }
}