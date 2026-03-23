// https://codeforces.com/problemset/problem/1814/A
import java.util.Scanner;
public class Solution_1814A_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(n%2 == 0 || k%2 == 1 ? "YES" : "NO");
        }
    }
}
