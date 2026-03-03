// https://codeforces.com/problemset/problem/486/A
import java.util.Scanner;
public class Solution_486A_Calculating_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(n%2 == 0 ? n/2 : (n+1)/-2);
    }
}