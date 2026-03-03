// https://codeforces.com/problemset/problem/1154/A
import java.util.Scanner;
public class Solution_1154A_Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        int max = Math.max(x1, Math.max(x2, Math.max(x3, x4)));
        if(x1 == max)
            System.out.println((x1 - x2) + " " + (x1 - x3) + " " + (x1 - x4));
        else if(x2 == max)
            System.out.println((x2 - x1) + " " + (x2 - x3) + " " + (x2 - x4));
        else if(x3 == max)
            System.out.println((x3 - x1) + " " + (x3 - x2) + " " + (x3 - x4));
        else 
            System.out.println((x4 - x1) + " " + (x4 - x2) + " " + (x4 - x3));
    }
}