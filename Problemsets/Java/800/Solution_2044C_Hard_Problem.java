// https://codeforces.com/problemset/problem/2044/C
import java.util.Scanner;
public class Solution_2044C_Hard_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a > m)
                a = m;
            if(b > m)
                b = m;
            System.out.println(2*m - a - b < c ? 2 * m : a + b + c);
        }
    }
}
