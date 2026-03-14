// https://codeforces.com/problemset/problem/1433/A
import java.util.Scanner;
public class Solution_1433A_Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            short n = sc.nextShort();
            System.out.println((((n%10)-1) * 10) + (n/10 == 0 ? 1 : (n/100 == 0 ? 3 : (n/1000 == 0 ? 6 : 10))));
        }
    }
}