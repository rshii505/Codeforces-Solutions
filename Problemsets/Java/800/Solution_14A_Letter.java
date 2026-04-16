// https://codeforces.com/problemset/problem/14/A
import java.util.Scanner;
public class Solution_14A_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte m = sc.nextByte();
        sc.nextLine();
        char[][] ch = new char[n][m];
        byte strtrw, strtcl, endrw, endcl;
        strtrw = (byte)(n - 1);
        strtcl = (byte)(m - 1);
        endrw = endcl = 0;
        for(byte i = 0; i < n; ++i)
        {
            String x = sc.nextLine();
            for(byte j = 0; j < m; ++j)
            {
                ch[i][j] = x.charAt(j);
                if(ch[i][j] == '*')
                {
                    if(i < strtrw)
                        strtrw = i;
                    if(i > endrw)
                        endrw = i;
                    if(j < strtcl)
                        strtcl = j;
                    if(j > endcl)
                        endcl = j;
                }
            }
        }
        for(; strtrw <= endrw; ++strtrw)
        {
            for(int x = strtcl; x <= endcl; ++x)
                System.out.print(ch[strtrw][x]);
            System.out.println();
        }
    }
}
