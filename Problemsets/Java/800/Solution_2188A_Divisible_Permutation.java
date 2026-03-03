// https://codeforces.com/problemset/problem/2188/A
import java.util.Scanner;
public class Solution_2188A_Divisible_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            boolean even = n%2==0;
            n = (byte)((n+1)/2);
            System.out.print(n+" ");
            byte i = 1;
            for(; i<n; ++i)
                System.out.print((n+i)+" "+(n-i)+" ");
            System.out.println(even ? n+i : "");
        }
    }
}
