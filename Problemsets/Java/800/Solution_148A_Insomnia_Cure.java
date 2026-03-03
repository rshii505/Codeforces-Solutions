// https://codeforces.com/problemset/problem/148/A
import java.util.Scanner;
public class Solution_148A_Insomnia_Cure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte k = sc.nextByte();
        byte l = sc.nextByte();
        byte m = sc.nextByte();
        byte n = sc.nextByte();
        int d = sc.nextInt();
        int cnt = 0;
        while(d != 0)
        {
            if(d%k == 0 || d%l == 0 || d%m == 0 || d%n == 0)
                ++cnt;
            --d;
        }
        System.out.println(cnt);
    }
}