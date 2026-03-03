// https://codeforces.com/problemset/problem/2191/A
import java.util.Scanner;
public class Solution_2191A_Array_Colouring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while (t-- != 0)
        {
            byte n = sc.nextByte();
            byte fact = (byte)(sc.nextByte()%2);
            boolean possible = true;
            for(byte i = 1; i<n; ++i)
            {
                if(sc.nextInt()%2 != (i+fact)%2) 
                    possible = false;
            }
            System.out.println(possible? "YES" : "NO");
        }
    }
}