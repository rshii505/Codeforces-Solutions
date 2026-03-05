import java.util.Scanner;
public class Solution_231A_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        short cnt = 0;
        while(n-- != 0)
        {
            if(sc.nextByte() + sc.nextByte() + sc.nextByte() > 1)
                ++cnt;
        }
        System.out.println(cnt);
    }
}