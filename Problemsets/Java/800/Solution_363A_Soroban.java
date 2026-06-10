// https://codeforces.com/problemset/problem/363/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_363A_Soroban {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        do
        {
            byte currdig = (byte)(n % 10);
            n /= 10;
            if(currdig >= 5)
            {
                System.out.print("-O|");
                currdig -= 5;
            }
            else 
                System.out.print("O-|");
            for(byte i = 0; i < currdig; ++i)
                System.out.print("O");
            System.out.print("-");
            for(byte i = currdig; i < 4; ++i)
                System.out.print("O");
            System.out.println();
        } while (n != 0);
    }
}
