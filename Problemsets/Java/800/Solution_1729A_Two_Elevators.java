// https://codeforces.com/problemset/problem/1729/A
import java.util.Scanner;
public class Solution_1729A_Two_Elevators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a < 0)
                a = -a;
            b = c - b;
            if(b < 0)
                b = -b;
            b += (c - 1);
            System.out.println(a < b ? 1 : (b < a ? 2 : 3));
        }
    }
}
