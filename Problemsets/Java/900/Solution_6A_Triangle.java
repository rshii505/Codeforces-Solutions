// https://codeforces.com/problemset/problem/6/A
import java.util.Scanner;
public class Solution_6A_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();
        byte d = sc.nextByte();
        if(((a + b > c) && (b + c > a) && (c + a > b)) || ((a + b > d) && (b + d > a) && (d + a > b)) || ((a + c > d) && (c + d > a) && (d + a > c)) || ((b + c > d) && (c + d > b) && (d + b > c)))
            System.out.println("TRIANGLE");
        else if(((a + b == c) || (b + c == a) || (c + a == b)) || ((a + b == d) || (b + d == a) || (d + a == b)) || ((a + c == d) || (c + d == a) || (d + a == c)) || ((b + c == d) || (c + d == b) || (d + b == c)))
            System.out.println("SEGMENT");
        else
            System.out.println("IMPOSSIBLE");
    }
}
