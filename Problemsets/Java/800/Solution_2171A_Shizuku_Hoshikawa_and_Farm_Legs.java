// https://codeforces.com/problemset/problem/2171/A
import java.util.Scanner;
public class Solution_2171A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            if(n%2 == 1)
            {
                System.out.println(0);
                continue;
            }    
            byte cnt = 0;
            for(byte i = 0; i<=n; i+=2)
            {
                if((n-i)/4.0 == (n-i)/4)
                    ++cnt;
            }
            System.out.println(cnt);
        }
    }
}
