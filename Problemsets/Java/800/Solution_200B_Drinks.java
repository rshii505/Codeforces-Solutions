// https://codeforces.com/problemset/problem/200/B
import java.util.Scanner;
public class Solution_200B_Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        short vol = 0;
        for(byte i = 0; i<n; ++i)
            vol+=sc.nextShort();
        System.out.println((vol*1.0)/n);
    }
}