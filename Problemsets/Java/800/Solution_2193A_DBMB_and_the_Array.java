// https://codeforces.com/problemset/problem/2193/A
import java.util.Scanner;
public class Solution_2193A_DBMB_and_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            byte s = sc.nextByte();
            byte x = sc.nextByte();
            byte sum = 0;
            while (n-- != 0)
                sum+=sc.nextByte();
            System.out.println((s-sum >= 0) && ((s-sum)%x == 0) ? "YES" : "NO");
        }
    }
}