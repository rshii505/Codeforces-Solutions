// https://codeforces.com/problemset/problem/1919/A
import java.util.Scanner;
public class Solution_1919A_Wallet_Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
            System.out.println((sc.nextInt()+sc.nextInt())%2 == 0? "Bob" : "Alice");
    }
}
