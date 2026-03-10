// https://codeforces.com/problemset/problem/2009/A
import java.util.Scanner;
public class Solution_2009A_Minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
            System.out.println(-sc.nextByte()+sc.nextByte());
    }
}