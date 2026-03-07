// https://codeforces.com/problemset/problem/1/A
import java.util.Scanner;
public class Solution_1A_Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        if(n%a != 0)
            n = n + a - (n%a);
        if(m%a != 0)
            m = m + a - (m%a);
        System.out.println((m*n)/(a*a));
    }
}