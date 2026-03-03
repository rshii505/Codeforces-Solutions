// https://codeforces.com/problemset/problem/2164/A
import java.util.Scanner;
public class Solution_2164A_Sequence_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            int[] a = new int[n];
            for(n = 0; n<a.length; ++n)
                a[n] = sc.nextInt();
            int x = sc.nextInt();
            if (a.length == 1)
                System.out.println(a[0] != x? "NO" : "YES");
            else
            {
                for(n = 0; n<a.length-1; ++n) 
                {
                    if ((a[n] == x) || (a[n] <= x && a[n+1] >= x) || (a[n] >= x && a[n+1] <= x))
                        break;
                }
                System.out.println(n == a.length-1? "NO" : "YES");
            }
        }
    }
}