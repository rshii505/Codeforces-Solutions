import java.util.Scanner;
public class Solution_1409A_Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = a - b;
            if(diff < 0)
                diff = -diff;
            System.out.println(diff % 10 == 0? diff/10 : (diff/10) + 1);
        }
    }
}