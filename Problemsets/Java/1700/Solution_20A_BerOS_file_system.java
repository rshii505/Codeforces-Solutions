// https://codeforces.com/problemset/problem/20/A
import java.util.Scanner;
public class Solution_20A_BerOS_file_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] prts = s.split("/+");
        System.out.print(prts.length == 0 ? "/" : prts[0]);
        for(int i = 1; i < prts.length; ++i)
            System.out.print("/"+prts[i]);
    }
}
