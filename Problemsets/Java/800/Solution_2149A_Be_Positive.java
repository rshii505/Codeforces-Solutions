// https://codeforces.com/problemset/problem/2149/A
import java.util.Scanner;
public class Solution_2149A_Be_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            byte zeroCnt = 0;
            boolean isPos = true;
            while(n-- != 0)
            {
                byte b = sc.nextByte();
                if(b == 0)
                    ++zeroCnt;
                else if(b == -1)
                    isPos = !isPos;
            }
            System.out.println(isPos ? zeroCnt : zeroCnt+2);
        }
    }
}