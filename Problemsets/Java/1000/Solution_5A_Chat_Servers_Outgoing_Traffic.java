// https://codeforces.com/problemset/problem/5/A
import java.util.Scanner;
public class Solution_5A_Chat_Servers_Outgoing_Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte ppl = 0;
        int trfc = 0;
        while (sc.hasNextLine())
        {
            String cmd = sc.nextLine();
            if(cmd.charAt(0) == '+')
                ++ppl;
            else if(cmd.charAt(0) == '-')
                --ppl;
            else
                trfc += (ppl * cmd.substring(cmd.indexOf(':') + 1).length());
        }
        System.out.println(trfc);
    }
}
