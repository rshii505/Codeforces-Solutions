// https://codeforces.com/problemset/problem/732/A
import java.util.Scanner;
public class Solution_732A_Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short k = sc.nextShort();
        byte r = sc.nextByte();
        if(k == r)
            System.out.println(1);
        else
        {
            for(byte n = 1; n<=10; ++n)
            {
                short x = (short)(k*n);
                if(x%10 == 0 || x%10 == r)
                {
                    System.out.println(n);
                    break;
                }
            }
        }
    }
}