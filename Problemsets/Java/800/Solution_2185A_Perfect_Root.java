// https://codeforces.com/problemset/problem/2185/A
import java.util.Scanner;
public class Solution_2185A_Perfect_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            while (n != 0)
                System.out.print(n-- + " ");
            System.out.println();
        }
    }
}