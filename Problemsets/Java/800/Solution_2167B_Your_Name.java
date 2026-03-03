// https://codeforces.com/problemset/problem/2167/B
import java.util.Scanner;
public class Solution_2167B_Your_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short q = sc.nextShort();
        while(q-- != 0)
        {
            byte n = sc.nextByte();
            char[] s1 = sc.next().toCharArray();
            char[] s2 = sc.next().toCharArray();
            System.out.println(isSame(s1, s2));
        }
    }
    static String isSame(char[] s1, char[] s2)
    {
        for(byte i=0; i<s1.length; ++i)
        {
            byte j=0;
            for(; j<s1.length; ++j)
            {
                if(s1[i] == s2[j])
                {
                    s2[j] = ' ';
                    break;
                }
            }
            if (j==s1.length)
                return "NO";
        }
        return "YES";
    }
}