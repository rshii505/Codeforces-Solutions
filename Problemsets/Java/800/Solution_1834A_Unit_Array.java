// https://codeforces.com/problemset/problem/1834/A 
import java.util.Scanner;
public class Solution_1834A_Unit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            byte neg = 0, pos = 0, cnt = 0;
            while(n-- != 0)
            {
                if(sc.nextByte() == 1)
                    ++pos;
                else
                    ++neg;
            }
            n = (byte)(pos - neg);
            if(n < 0)
                cnt = (byte)((1 - n) / 2);
            neg -= cnt;
            if(neg % 2 != 0)
                ++cnt;
            System.out.println(cnt);
        }
    }
}
