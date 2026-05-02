// https://codeforces.com/problemset/problem/46/A
import java.util.Scanner;
public class Solution_46A_Ball_Game {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      byte n = sc.nextByte();
      short curr = 1; 
      byte numthrw = 1;
      while(n - numthrw != 0)
      {
        curr += numthrw;
        curr %= n;
        ++numthrw;
        System.out.print((curr == 0 ? n : curr) + "\t");
      }
      System.out.println();
    }
}