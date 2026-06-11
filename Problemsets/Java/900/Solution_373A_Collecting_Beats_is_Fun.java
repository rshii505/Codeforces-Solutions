// https://codeforces.com/problemset/problem/373/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_373A_Collecting_Beats_is_Fun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte k = (byte)(Byte.parseByte(br.readLine()) * 2);
        byte[] time = new byte[9];
        boolean yes = true;
        otr:
        for(byte i = 0; i < 4; ++i)
        {
            String panels = br.readLine();
            for(byte j = 0; j < 4; ++j)
            {
                char ch = panels.charAt(j);
                if(ch == '.')
                    continue;
                else if(time[ch - 49]++ == k)
                {
                    yes = false;
                    break otr;
                }
            }
        }
        System.out.println(yes ? "YES" : "NO");
    }
}
