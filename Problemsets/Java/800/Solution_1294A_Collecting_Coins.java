// https://codeforces.com/problemset/problem/1294/A
import java.util.Scanner;
public class Solution_1294A_Collecting_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
            n = n - ((max * 3) - a - b - c);
            System.out.println(n % 3 == 0 && n >= 0? "YES" : "NO");
        }
    }
}
