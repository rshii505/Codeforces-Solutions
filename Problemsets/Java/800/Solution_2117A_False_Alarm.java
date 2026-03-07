// https://codeforces.com/problemset/problem/2117/A
import java.util.Scanner;
public class Solution_2117A_False_Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            boolean b = true;
            byte n = sc.nextByte();
            byte x = sc.nextByte();
            while(n-- > 0)
            {
                if(sc.nextByte() == 1)
                {
                    --x;
                    break;
                }
            }
            while(n > 0 && x > 0)
            {
                sc.nextByte();
                --n;
                --x;
            }
            while(n-- > 0)
            {
                if(sc.nextByte() == 1)
                {
                    b = !b;
                    break;
                }
            }
            if(n > 0)
                sc.nextLine();
            System.out.println(b ? "YES" : "NO");
        }
    }
}