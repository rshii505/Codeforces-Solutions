// https://codeforces.com/problemset/problem/263/A
import java.util.Scanner;
public class Solution_263A_Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte i = 1, j = 1;
        outer:
        for(i=1; i<=5; ++i)
        {
            for(j=1; j<=5; ++j)
            {
                if(sc.nextInt()==1)
                    break outer;
            }
        }
        System.out.println(Math.abs(3-i)+Math.abs(3-j));
    }
}