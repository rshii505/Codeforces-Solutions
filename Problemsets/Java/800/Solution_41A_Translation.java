// https://codeforces.com/problemset/problem/41/A
import java.util.Scanner;
public class Solution_41A_Translation {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(sc.nextLine().equals(new StringBuilder(sc.nextLine()).reverse().toString()) ? "YES" : "NO");
    }
}