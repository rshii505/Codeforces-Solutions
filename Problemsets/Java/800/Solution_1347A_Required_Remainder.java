// https://codeforces.com/problemset/problem/1374/A
import java.util.Scanner;
public class Solution_1347A_Required_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int rem = n%x;
            System.out.println((rem >= y) ? (n - rem + y) : (n - rem - x + y));
        }
    }
}