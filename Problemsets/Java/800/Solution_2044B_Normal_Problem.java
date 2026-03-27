// https://codeforces.com/problemset/problem/2044/B
import java.util.Scanner;
public class Solution_2044B_Normal_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            String a = sc.next();
            for(byte i = (byte)(a.length() - 1); i >= 0; --i)
            {
                char ch = a.charAt(i);
                System.out.print(ch == 'p' ? 'q' : (ch == 'q' ? 'p' : 'w'));
            }
            System.out.println();
        }
    }
}
