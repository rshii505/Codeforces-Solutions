// https://codeforces.com/problemset/problem/1873/C
import java.util.Scanner;
public class Solution_1873C_Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            short cnt = 0;
            for(int i = 1; i<=10; ++i)
            {
                String s = sc.next();
                for(int j = 1; j<= 10; ++j)
                {
                    if(s.charAt(j-1) == 'X')
                    {
                        if(i == 1 || i == 10 || j == 1 || j == 10)
                            cnt += 1;
                        else if(i == 2 || i == 9 || j == 2 || j == 9)
                            cnt += 2;
                        else if(i == 3 || i == 8 || j == 3 || j == 8)
                            cnt += 3;
                        else if(i == 4 || i == 7 || j == 4 || j == 7)
                            cnt += 4;
                        else 
                            cnt += 5;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}