// https://codeforces.com/problemset/problem/1624/A
import java.util.Scanner;
public class Solution_1624A_Plus_One_on_the_Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte n = sc.nextByte();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(n-- != 0)
            {
                int x = sc.nextInt();
                if(x < min)
                    min = x;
                if(x > max)
                    max = x;
            }
            System.out.println(max - min);
        }
    }
}
