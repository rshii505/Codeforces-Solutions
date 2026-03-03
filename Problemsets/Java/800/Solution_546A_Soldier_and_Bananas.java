// https://codeforces.com/problemset/problem/546/A
import java.util.Scanner;
public class Solution_546A_Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short k = sc.nextShort();
        int n = sc.nextInt();
        short w = sc.nextShort();
        n = k*w*(w+1)/2 - n ;
        System.out.print(n <= 0 ? 0 : n);
        
    }
}