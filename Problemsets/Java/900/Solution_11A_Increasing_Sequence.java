// https://codeforces.com/problemset/problem/11/A
import java.util.Scanner;
public class Solution_11A_Increasing_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = (short)(sc.nextShort() - 1);
        int d = sc.nextInt();
        int cnt = 0;
        int x = sc.nextInt();
        while(n-- != 0)
        {
            int y = sc.nextInt();
            if(y > x)
                x = y;
            else
            {
                cnt += (((x - y) / d) + 1);
                x = y + (d * ((int)(((x - y) / d) + 1)));
            }
        }
        System.out.println(cnt);
    }
}
