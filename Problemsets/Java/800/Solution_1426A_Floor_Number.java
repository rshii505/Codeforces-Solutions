// https://codeforces.com/problemset/problem/1426/A
import java.util.Scanner;
public class Solution_1426A_Floor_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            short n = sc.nextShort();
            short x = sc.nextShort();
            System.out.println(n < 3 ? 1 : 1 + (n - 2 + x - 1) / x);
        }
    }
}
