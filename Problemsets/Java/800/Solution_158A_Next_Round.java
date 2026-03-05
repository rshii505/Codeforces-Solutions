import java.util.Scanner;
public class Solution_158A_Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte k = sc.nextByte();
        byte cnt = 0;
        n = (byte)(n - k);
        while(k-- != 1)
        {
            if(sc.nextByte() == 0)
                break;
            ++cnt;
        }
        k = sc.nextByte();
        if(k != 0)
            ++cnt;
        while(n-- != 0)
        {
            byte temp = sc.nextByte();
            if(temp != 0 && k == temp)
                ++cnt;
        }
        System.out.println(cnt);
    }
}