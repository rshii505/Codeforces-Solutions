// https://codeforces.com/problemset/problem/2167/A
import java.util.Scanner;
public class Solution_2167A_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n1 = sc.nextByte();
            byte n2 = sc.nextByte();
            byte n3 = sc.nextByte();
            byte n4 = sc.nextByte();
            System.out.println(n1==n2 && n1==n3 && n1==n4? "YES" : "NO");
        }
    }
}