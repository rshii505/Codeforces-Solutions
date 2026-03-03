// https://codeforces.com/problemset/problem/2182/B
import java.util.Scanner;
public class Solution_2182B_New_Year_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = b1;
            int b2 = a1;
            byte cnt = 0;
            while((a1>=0 && b1>=0) || (a2>=0 && b2>=0))
            {
                if(cnt%2==0)
                {
                    a1 = a1 - (int)Math.pow(2, cnt);
                    a2 = a2 - (int)Math.pow(2, cnt);
                }
                else
                {
                    b1 = b1 - (int)Math.pow(2, cnt);
                    b2 = b2 - (int)Math.pow(2, cnt);
                }
                ++cnt;
            }
            System.out.println(--cnt);
        }
    }
}