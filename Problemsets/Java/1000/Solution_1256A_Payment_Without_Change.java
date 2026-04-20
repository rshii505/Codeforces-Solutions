// https://codeforces.com/problemset/problem/1256/A
import java.util.Scanner;
public class Solution_1256A_Payment_Without_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short q = sc.nextShort();
        while(q-- != 0)
        {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long n = sc.nextInt();
            long S = sc.nextInt();
            System.out.println(((S / n <= a) && (S % n <= b)) || ((S - (a * n) <= b) && (S - (a * n) >= 0))? "YES" : "NO");
        }
    }
}