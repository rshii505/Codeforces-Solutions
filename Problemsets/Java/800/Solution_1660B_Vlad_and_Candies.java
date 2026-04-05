// https://codeforces.com/problemset/problem/1660/B
import java.util.Scanner;
public class Solution_1660B_Vlad_and_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int n = sc.nextInt() - 1, x = sc.nextInt(), y = 0;
            while(n-- != 0)
            {
                int temp = sc.nextInt();
                if(temp > x)
                {
                    y = x;
                    x = temp;
                }
                else if(temp > y)
                    y = temp;
            }
            System.out.println(x - y < 2 ? "YES" : "NO");
        }
    }
}
