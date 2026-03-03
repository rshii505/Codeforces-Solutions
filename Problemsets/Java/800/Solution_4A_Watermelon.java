// https://codeforces.com/problemset/problem/4/A
import java.util.Scanner;
public class Solution_4A_Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        System.out.print(n%2 == 0 && n>=4 ? "YES" : "NO");
    }
}