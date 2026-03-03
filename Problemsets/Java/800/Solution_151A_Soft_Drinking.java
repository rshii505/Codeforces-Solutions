// https://codeforces.com/problemset/problem/151/A
import java.util.Scanner;
public class Solution_151A_Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        short k = sc.nextShort();
        short l = sc.nextShort();
        short c = sc.nextShort();
        short d = sc.nextShort();
        short p = sc.nextShort();
        short nl = sc.nextShort();
        short np = sc.nextShort();
        System.out.println((((int)(Math.min(Math.min(((k*l)/nl), (c*d)), (p/np))))/n));
    }
}