// https://codeforces.com/problemset/problem/750/A
import java.util.Scanner;
public class Solution_750A_New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte time = (byte)((240 - sc.nextShort())/5);
        while((n*(n+1))/2 > time)
            --n;
        System.out.println(n);
    }
}