// https://codeforces.com/problemset/problem/2172/A
import java.util.Scanner;
public class Solution_2172A_ASCII_Art_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte g = sc.nextByte();
        byte c = sc.nextByte();
        byte l = sc.nextByte();
        byte max = (byte)Math.max(g, Math.max(c, l));
        byte min = (byte)Math.min(g, Math.min(c, l));
        System.out.println(max - min >= 10 ? "check again" : "final "+(g+c+l-max-min));
    }
}