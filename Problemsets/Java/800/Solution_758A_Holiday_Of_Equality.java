// https://codeforces.com/problemset/problem/758/A
import java.util.Scanner;
public class Solution_758A_Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        int x  = 0;
        int[] a = new int[n];
        while(n-- != 0)
        {
            a[n] = sc.nextInt();
            if(a[n] > x)
                x = a[n];
        }
        n = (byte)a.length;
        x *= n;
        while(n-- != 0)
            x -= a[n];
        System.out.println(x);
    }
}