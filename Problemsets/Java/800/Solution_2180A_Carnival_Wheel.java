// https://codeforces.com/problemset/problem/2180/A
import java.util.Scanner;
public class Solution_2180A_Carnival_Wheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            short l = sc.nextShort();
            short a = sc.nextShort();
            short b = sc.nextShort();
            short max, i;
            max = i = a;
            do
            {
                i = (short)((i+b)%l);
                max = i > max ? i : max;
            } while (i != a);
            System.out.println(max);
        }
    }
}