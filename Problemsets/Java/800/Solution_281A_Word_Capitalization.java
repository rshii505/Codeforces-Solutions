// https://codeforces.com/problemset/problem/281/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_281A_Word_Capitalization {
    public static void main(String[] args) throws IOException {
      String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
      System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
      
    }
}
