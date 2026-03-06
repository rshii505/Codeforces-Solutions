// https://codeforces.com/problemset/problem/2195/A
import java.util.Scanner;
public class Solution_2195A_Sieve_of_Erato67henes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            boolean b = false;
            byte n = sc.nextByte();
            while(n-- != 0)
            {
                if(sc.nextByte() == 67)
                    b = true;
            }
            System.out.println(b ? "YES" : "NO");
        }
    }
}