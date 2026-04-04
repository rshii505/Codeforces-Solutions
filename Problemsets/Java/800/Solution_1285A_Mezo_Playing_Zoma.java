// https://codeforces.com/problemset/problem/1285/A
import java.util.Scanner;
public class Solution_1285A_Mezo_Playing_Zoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        int r = 0;
        int n = sc.nextInt();
        String s = sc.next();
        while(n-- != 0)
        {
            if(s.charAt(n) == 'L')
                ++l;
            else
                ++r;
        }
        System.out.println(l+r+1);
    }
}
