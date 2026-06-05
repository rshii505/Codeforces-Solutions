// https://codeforces.com/problemset/problem/306/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_306A_Candies {
    public static void main(String[] args) throws IOException {
        StringTokenizer inpt = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte n = Byte.parseByte(inpt.nextToken());
        byte m = Byte.parseByte(inpt.nextToken());
        byte min = (byte)(n / m);
        n = (byte)(n % m);
        for(; n-- != 0; --m)
            System.out.print((min + 1) + " ");
        while(m-- != 0)
            System.out.print(min + " ");
        System.out.println();
    }
}
