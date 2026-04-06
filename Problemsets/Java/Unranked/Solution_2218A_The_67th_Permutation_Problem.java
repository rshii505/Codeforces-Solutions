// https://codeforces.com/problemset/problem/2218/C
import java.util.Scanner;
public class Solution_2218A_The_67th_Permutation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            int x = n;
            for(int i = 1; i <= n; ++i)
            {
                System.out.print(i + " " + (i + x) + " " + (i + x + 1) + " ");
                ++x;
            }
            System.out.println();
        }
    }
}
