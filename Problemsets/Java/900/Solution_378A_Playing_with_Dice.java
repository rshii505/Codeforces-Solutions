// https://codeforces.com/problemset/problem/378/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_378A_Playing_with_Dice {
    public static void main(String[] args) throws IOException {
        StringTokenizer inpt = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte a = Byte.parseByte(inpt.nextToken());
        byte b = Byte.parseByte(inpt.nextToken());
        byte win, draw, lose;
        win = draw = lose = 0;
        for(byte i = 1; i <= 6; ++i)
        {
            byte x = result(a, b, i);
            if(x == 1)
                ++win;
            else if (x == 0)
                ++draw;
            else
                ++lose;
        }
        System.out.println(win + " " + draw + " " + lose);
    }
    static byte result(byte a, byte b, byte i)
    {
        return (byte)(Math.abs(a - i) < Math.abs(b - i) ? 1 : (Math.abs(a - i) == Math.abs(b - i) ? 0 : -1));
    }
}
