// https://codeforces.com/problemset/problem/69/A
import java.util.Scanner;
public class Solution_69A_Young_Physicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        short x, y, z;
        x = y = z = 0;
        while(n-- != 0)
        {
            x += sc.nextShort();
            y += sc.nextShort();
            z += sc.nextShort();
        }
        System.out.print(x == 0 & y == 0 & z == 0 ? "YES" : "NO");
    }
}