// https://codeforces.com/problemset/problem/1283/A
import java.util.Scanner;
public class Solution_1283A_Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
            System.out.println((23 - sc.nextByte())*60 + (60 - sc.nextByte()));
    }
}
