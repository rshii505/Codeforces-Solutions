// https://codeforces.com/problemset/problem/2185/B
import java.util.Scanner;
public class Solution_2185B_Prefix_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-- != 0)
        {
            byte n = sc.nextByte();
            short max = 1;
            for(byte i = 0; i<n; ++i)
            {
                short x = sc.nextShort();
                if(max<x)
                    max = x;
            }
            System.out.println(max*n);
        }
    }
}