// https://codeforces.com/problemset/problem/1553/A
import java.util.Scanner;
public class Solution_1553A_Digits_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            System.out.println(n % 10 == 9 ? (n / 10) + 1 : n / 10);
        }
    }
}
