// https://codeforces.com/problemset/problem/2218/B
import java.util.Scanner;
public class Solution_2218A_The_67th_6_7_Integer_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte nums[] = new byte[7];
            short x = -67;
            for(byte i = 0; i < 7; ++i)
            {
                nums[i] = sc.nextByte();
                if(nums[i] > x)
                    x = nums[i];
            }
            x *= 2;
            for(byte i : nums)
                x -= i;
            System.out.println(x);
        }
    }
}
