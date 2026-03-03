// https://codeforces.com/problemset/problem/479/A
import java.util.Scanner;
public class Solution_479A_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();
        if(a == 1 && c == 1)
            System.out.println(a+b+c);
        else if((a == 1 && b == 1) || (b == 1 && c == 1))
            System.out.println(2*(a+b+c-2));
        else if(a == 1 || (b == 1 && a < c))
            System.out.println((a+b)*c);
        else if(c == 1 || (b == 1 && a >= c))
            System.out.println(a*(b+c));
        else 
            System.out.println(a*b*c);
    }
}