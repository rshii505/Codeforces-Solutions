// https://codeforces.com/problemset/problem/1955/A
import java.util.Scanner;
public class Solution_1955A_Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            byte a = sc.nextByte();
            byte b = sc.nextByte();
            b = a*2 < b ? (byte)(a*2) : b;
            System.out.println(n%2 == 0? b*(n/2) : b*((n-1)/2) + a);
        }
    }
}
