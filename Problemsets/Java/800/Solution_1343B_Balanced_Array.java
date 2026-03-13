// https://codeforces.com/problemset/problem/1343/B
import java.util.Scanner;
public class Solution_1343B_Balanced_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int n = sc.nextInt()/2;
            if(n%2 != 0)
            {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            int i = 1;
            while(i <= n)
                System.out.print((i++ * 2) + "\t");
            i *= 2;
            n /= 2;
            for(int j = 0; j < n; ++j)
                System.out.print((i - 1 - (j*2)) + "\t" + ((j*2) + 1) + "\t");
            System.out.println();
        }
    }
}