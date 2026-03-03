// https://codeforces.com/problemset/problem/723/A
import java.util.Scanner;
public class Solution_723A_The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte x1 = sc.nextByte();
        byte x2 = sc.nextByte();
        byte x3 = sc.nextByte();
        System.out.println(Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3));
    }
}