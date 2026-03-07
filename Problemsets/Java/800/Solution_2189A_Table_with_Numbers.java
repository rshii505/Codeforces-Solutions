// https://codeforces.com/problemset/problem/2189/A
import java.util.Scanner;
public class Solution_2189A_Table_with_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            short h = sc.nextShort();
            short l = sc.nextShort();
            if(h > l)
            {
                h = (short)(h + l);
                l = (short)(h - l);
                h = (short)(h - l);
            }
            byte small = 0;
            byte big = 0;
            for(byte i = 0; i < n; ++i)
            {
                short temp = sc.nextShort();
                if(temp <= h)
                    ++small;
                else if(temp <= l)
                    ++big;
            }
            System.out.println(big > small ? small : big + ((small-big)/2));
        }
    }
}