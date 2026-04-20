// https://codeforces.com/problemset/problem/10/A
import java.util.Scanner;
public class Solution_10A_Power_Consumption_Calculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte() - 1;
        int p1 = sc.nextByte();
        int p2 = sc.nextByte();
        int p3 = sc.nextByte();
        int t1 = sc.nextByte();
        int t2 = sc.nextByte();
        int l = sc.nextShort();
        int r = sc.nextShort();
        int sum = 0;
        while(n-- != 0)
        {
            sum += ((r - l) * p1);
            l = sc.nextShort();
            int intrvl = l - r;
            
            if(intrvl > t1)
            {
                sum += (t1 * p1);
                intrvl -= t1;
            }
            else
            {
                sum += (intrvl * p1);
                intrvl = 0;
            }
            
            if(intrvl > t2)
            {
                sum += (t2 * p2);
                intrvl -= t2;
            }
            else
            {
                sum += (intrvl * p2);
                intrvl = 0;
            }
            
            sum += (intrvl * p3);
            r = sc.nextShort();
        }
        sum += ((r - l) * p1);
        System.out.println(sum);
    }
}