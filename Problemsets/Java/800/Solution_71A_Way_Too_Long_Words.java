// https://codeforces.com/problemset/problem/71/A
import java.util.Scanner;
public class Solution_71A_Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        while(n-- != 0)
        {
            String s = sc.next();
            System.out.println(s.length() < 11 ? s : ""+s.charAt(0)+(s.length()-2)+s.charAt(s.length() - 1));
        }
    }
}
