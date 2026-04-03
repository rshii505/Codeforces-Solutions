// https://codeforces.com/problemset/problem/2145/A
import java.util.Scanner;
public class Solution_2145A_Candies_for_Nephews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            byte n = (byte)(3 - (sc.nextByte() % 3));
            System.out.println(n == 3 ? 0 : n);
        }
    }
}
