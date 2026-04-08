// https://codeforces.com/problemset/problem/2217/A
import java.util.Scanner;
public class Solution_2217A_The_Equalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            int k = sc.nextShort() * n;
            int sum = 0;
            while(n-- != 0)
                sum += sc.nextShort();
            System.out.println((sum % 2 == 1) || (k % 2 == 0) ? "YES" : "NO");
        }
    }
}
