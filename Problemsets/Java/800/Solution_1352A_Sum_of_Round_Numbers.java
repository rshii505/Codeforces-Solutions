// https://codeforces.com/problemset/problem/1352/A
import java.util.Scanner;
public class Solution_1352A_Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            short n = sc.nextShort();
            int i = 1;
            String x = "";
            byte cnt = 0;
            while(i <= n)
            {
                short temp = (short)(((n%(i*10)) / i) * i);
                if (temp != 0)
                {
                    ++cnt;
                    x = x + temp + " ";
                }
                i = i*10;
            }
            System.out.println(cnt+"\n"+x);
        }
    }
}