// https://codeforces.com/problemset/problem/1866/A
import java.util.Scanner;
public class Solution_1866A_Ambitious_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = Integer.MAX_VALUE;
        while(n-- != 0)
        {
            int temp = sc.nextInt();
            x = temp >= 0 ? (x < temp ? x : temp) : (x < -temp ? x : -temp);
        }
        System.out.println(x);
    }
}
