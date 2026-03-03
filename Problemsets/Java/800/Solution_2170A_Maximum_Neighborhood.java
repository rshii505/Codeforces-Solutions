// https://codeforces.com/problemset/problem/2170/A
import java.util.Scanner;
public class Solution_2170A_Maximum_Neighborhood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            System.out.println(n==1 ? 1 : (n==2 ? 9 : (n==3 ? 29 : (n==4 ? 56 : (n*n - 1 - n)*5))));
        }
    }
}