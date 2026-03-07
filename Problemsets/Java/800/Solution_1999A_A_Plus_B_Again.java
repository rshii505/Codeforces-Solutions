// https://codeforces.com/problemset/problem/1999/A
import java.util.Scanner;
public class Solution_1999A_A_Plus_B_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            System.out.println((n/10)+(n%10));
        }
    }
}
