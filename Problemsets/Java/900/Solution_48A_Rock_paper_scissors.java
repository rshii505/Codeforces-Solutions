// https://codeforces.com/problemset/problem/48/A
import java.util.Scanner;
public class Solution_48A_Rock_paper_scissors{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char f = sc.next().charAt(0);
      char m = sc.next().charAt(0);
      char s = sc.next().charAt(0);
      if(m == s)
      {
        if((f == 's' && m == 'p') || (f == 'p' && m == 'r') || (f == 'r' && m == 's'))
          System.out.println('F');
        else
          System.out.println('?');
      }
      else if(f == s)
      {
        if((m == 's' && s == 'p') || (m == 'p' && s == 'r') || (m == 'r' && s == 's'))
          System.out.println('M');
        else
          System.out.println('?');
      }
      else if(f == m)
      {
        if((s == 's' && f == 'p') || (s == 'p' && f == 'r') || (s == 'r' && f == 's'))
          System.out.println('S');
        else
          System.out.println('?');
      }
      else
        System.out.println('?');
    }
    
}