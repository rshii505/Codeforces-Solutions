// https://codeforces.com/problemset/problem/1328/A
import java.util.Scanner;
public class Solution_1328A_Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a%b == 0? 0 : b - (a%b));
        }
    }
}