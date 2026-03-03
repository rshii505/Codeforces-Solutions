// https://codeforces.com/problemset/problem/1335/A
import java.util.Scanner;
public class Solution_1335A_Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            System.out.println(n%2 == 0 ? (n-2)/2 : (n-1)/2);
        }
    }
}