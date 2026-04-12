// https://codeforces.com/problemset/problem/9/A
import java.util.Scanner;
public class Solution_9A_Die_Roll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch(7 - Math.max(sc.nextByte(), sc.nextByte()))
        {
            case 1 -> System.out.println("1/6");
            case 2 -> System.out.println("1/3");
            case 3 -> System.out.println("1/2");
            case 4 -> System.out.println("2/3");
            case 5 -> System.out.println("5/6");
            case 6 -> System.out.println("1/1");
        }
    }
}
