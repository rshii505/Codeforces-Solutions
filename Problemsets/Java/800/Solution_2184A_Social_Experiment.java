// https://codeforces.com/problemset/problem/2184/A
import java.util.Scanner;
public class Solution_2184A_Social_Experiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            short n = sc.nextShort();
            System.out.println(n == 3? 3 : (n == 2 ? 2 : n%2));
        }
    }
}