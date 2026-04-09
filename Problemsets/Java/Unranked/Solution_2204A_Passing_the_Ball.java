// https://codeforces.com/problemset/problem/2204/A
import java.util.Scanner;
public class Solution_2204A_Passing_the_Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            String s = sc.next();
            byte cnt = 1;
            for(byte i = 0; i < n; ++i)
            {
                if(s.charAt(i) == 'L')
                    break;
                ++cnt;
            }
            System.out.println(cnt);
        }
    }
}
