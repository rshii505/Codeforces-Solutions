// https://codeforces.com/problemset/problem/330/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_330A_Cakeminator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inpt = new StringTokenizer(br.readLine());
        char[][] cake = new char[Byte.parseByte(inpt.nextToken())][Byte.parseByte(inpt.nextToken())];
        byte ate = 0;
        for(byte i = 0; i < cake.length; ++i)
        {
            String x = br.readLine();
            boolean isStrw = false;
            for(byte j = 0; j < cake[0].length; ++j)
            {
                cake[i][j] = x.charAt(j);
                if(cake[i][j] == 'S')
                    isStrw = true;
            }
            if(!isStrw)
            {
                ate += cake[0].length;
                for(byte j = 0; j < cake[0].length; ++j)
                    cake[i][j] = 'O';
            }
        }
        for(byte i = 0; i < cake[0].length; ++i)
        {
            byte t = 0;
            for(byte j = 0; j < cake.length; ++j)
            {
                if(cake[j][i] == '.')
                    ++t;
                else if(cake[j][i] == 'S')
                {
                    t = 0;
                    break;
                }
            }
            ate += t;
        }
        System.out.println(ate);
    }
}
