// https://codeforces.com/problemset/problem/1996/A
import java.util.Scanner;
public class Solution_1996A_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            short n = sc.nextShort();
            System.out.println((n/4)+((n%4)/2));
        }
    }
}