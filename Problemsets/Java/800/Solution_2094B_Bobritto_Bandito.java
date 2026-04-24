// https://codeforces.com/problemset/problem/2094/B
import java.util.Scanner;
public class Solution_2094B_Bobritto_Bandito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- != 0)
        {
          short intrvl = (short)(sc.nextShort() - sc.nextShort());
          short l = sc.nextShort();
          short r = (short)(sc.nextShort() - intrvl);
          System.out.println(r >= 0 ? l + " " + r : (l - r) + " " + 0);
        }
        
    }
}