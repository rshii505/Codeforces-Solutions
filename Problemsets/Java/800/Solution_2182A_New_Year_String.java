// https://codeforces.com/problemset/problem/2182/A
import java.util.Scanner;
public class Solution_2182A_New_Year_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            sc.nextByte();
            String s = sc.next();
            System.out.println((s.indexOf("2025") == -1) || (s.indexOf("2026") != -1) ? 0 : 1);
        }
    }
}