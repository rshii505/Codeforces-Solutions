// https://codeforces.com/problemset/problem/318/A
import java.util.Scanner;
public class Solution_318A_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(k > (n+1)/2 ? 2*(k - (n+1)/2) : 2*k - 1);
    }
}