// https://codeforces.com/problemset/problem/2197/A
import java.util.Scanner;
public class Solution_2197A_Friendly_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int x = sc.nextInt();
            if(x%9 != 0)
                System.out.println(0);
            else 
            {
                int i = x;
                for(; i<=x+81; ++i)
                {
                    if(i - dig(i) == x)
                        break;
                }
                System.out.println(i == x+82? 0 : 10);
            }
        }
    }
    static int dig(int n)
    {
        return n == 0? 0 : (n%10)+dig(n/10);
    }
}