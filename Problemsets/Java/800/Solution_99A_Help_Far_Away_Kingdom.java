// https://codeforces.com/problemset/problem/99/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_99A_Help_Far_Away_Kingdom {
    public static void main(String[] args) throws IOException {
      String num = new BufferedReader(new InputStreamReader(System.in)).readLine();
      short idx = (short)num.indexOf('.');
      System.out.print(num.charAt(idx - 1) == '9' ? "GOTO Vasilisa." : (num.charAt(idx + 1) >= 53 ? num.substring(0, idx - 1) + ((char)(num.charAt(idx - 1) + 1)): num.substring(0, idx)));
    }
}