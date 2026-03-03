// https://codeforces.com/problemset/problem/61/A
import java.util.Scanner;
public class Solution_61A_Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        for(int i = 0; i<n1.length(); ++i)
            System.out.print(n1.charAt(i) == n2.charAt(i) ? 0 : 1);
    }
}