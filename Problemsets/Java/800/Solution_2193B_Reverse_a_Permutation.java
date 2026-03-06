import java.util.Scanner;
public class Solution_2193B_Reverse_a_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int revstrt = 0;
            int revend = 0;
            int i = n;
            
            
            for(; i > 0; --i)
            {
                a[n-i] = sc.nextInt();
                if(a[n-i] != i)
                {
                    revstrt = n-i;
                    break;
                }
            }
            for(int j = i-1; j > 0; --j)
            {
                a[n-j] = sc.nextInt();
                if(a[n-j] == i)
                {
                    revend = n-j;
                    i = j-1;
                    break;
                }
            }
            for(; i > 0; --i)
                a[n-i] = sc.nextInt();
                
                
            for(i = 0; i<revstrt; ++i)
                System.out.print(a[i]+" ");
            for(i = revend; i>=revstrt; --i)
                System.out.print(a[i]+" ");
            for(i = revend+1; i<n; ++i)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}