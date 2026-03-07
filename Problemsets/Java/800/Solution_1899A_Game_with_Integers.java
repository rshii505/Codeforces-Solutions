// https://codeforces.com/problemset/problem/1899/A
import java.util.Scanner;
public class Solution_1899A_Game_with_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
            System.out.println(sc.nextShort()%3 != 0 ? "First" : "Second");
    }
}