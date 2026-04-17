// https://codeforces.com/problemset/problem/16/A
import java.util.Scanner;
public class Solution_16A_Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte m = sc.nextByte();
        boolean b = true;
        sc.nextLine();
        String s = " ";
        while(n-- != 0)
        {
            String x = sc.nextLine();
            if(s.charAt(0) == x.charAt(0) || x.replace(x.substring(0,1), "").length() != 0)
                break;
            s = x;
        }
        System.out.println(n == -1 ? "YES" : "NO");
    }
}
