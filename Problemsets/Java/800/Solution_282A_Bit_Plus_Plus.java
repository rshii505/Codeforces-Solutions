// https://codeforces.com/problemset/problem/282/A
import java.util.Scanner;
public class Solution_282A_Bit_Plus_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        short cnt = 0;
        while(n-- != 0)
            cnt = sc.next().indexOf('+') == -1 ? --cnt : ++cnt;
        System.out.println(cnt);
    }
}
