// https://codeforces.com/problemset/problem/12/A
import java.util.Scanner;
public class Solution_12A_Super_Agent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] ch = new char[3][3];
        for(int i = 0; i < 3; ++i)
        {
            String x = sc.nextLine();
            for(int j = 0; j < 3; ++j)
                ch[i][j] = x.charAt(j);
        }
        boolean pass = true;
        for(int i = 0; i <= 1; ++i)
        {
            for(int j = 0; j <= 2 - i; ++j)
            {
                if(ch[i][j] != ch[2 - i][2 - j])
                {
                    pass = false;
                    break;
                }
            }
        }
        System.out.println(pass ? "YES" : "NO");
    }
}
