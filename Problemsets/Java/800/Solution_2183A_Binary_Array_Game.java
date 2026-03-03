// https://codeforces.com/problemset/problem/2183/A
import java.util.Scanner;
public class Solution_2183A_Binary_Array_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            boolean b1 = sc.nextByte() == 1;
            while(--n != 1)
                sc.nextByte();
            boolean b2 = sc.nextByte() == 1;
            System.out.println(b1 || b2 ? "Alice" : "Bob");
            
        }
    }
}