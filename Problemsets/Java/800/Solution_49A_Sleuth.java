// https://codeforces.com/problemset/problem/49/A
import java.util.Scanner;
public class Solution_49A_Sleuth {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      for(byte i = (byte)(s.lastIndexOf('?') - 1); true; --i)
      {
        if(s.charAt(i) == ' ')  
          continue;
        System.out.println("AEIOUYaeiouy".indexOf(s.charAt(i)) != -1 ? "YES" : "NO");
        break;
      }
    }
}