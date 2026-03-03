// https://codeforces.com/problemset/problem/2179/A
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution_2179A_Blackslex_and_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            byte k = sc.nextByte();
            byte x = sc.nextByte();
            if(k == 1)
                System.out.println(x+1);
            else
            {
                short n = (short)(x+1);
                ArrayList<Integer> currChar = new ArrayList<>(Collections.nCopies(n, 0));
                short temp = 2;
                outermost:
                while(true)
                {
                    
                    for(short i = 1; i<n; ++i)
                    {
                        for(short j = temp; j<=n; ++j)
                        {
                            if((j-i)%x != 0)
                                continue;
                            if(currChar.get(i-1) == currChar.get(j-1))
                                currChar.set((j-1), currChar.get(j-1) + 1);
                            if (currChar.get(j-1) == k)
                                break outermost;
                            
                        }
                    }
                    ++n;
                    temp = n;
                    currChar.add(0);
                }
                System.out.println(n);
            }
        }
    }
}