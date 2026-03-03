// https://codeforces.com/problemset/problem/617/A
import java.util.Scanner;
public class Solution_617A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x%5 == 0 ? x/5 :  (x/5)+1);
    }
}