import java.util.Scanner;
public class Solution_2195B_Heapify_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            boolean b[] = new boolean[n];
            boolean isHeapifiable = true;
            for(int i = 0; i<n; ++i)
                a[i] = sc.nextInt();
            outer:
            for(int i = 1; i<=n; ++i)
            {
                for(int j = i; j<=n; j*=2)
                {
                    if(!b[j-1])
                    {
                        if(a[j-1]%i != 0)
                        {
                            isHeapifiable = false;
                            break outer;
                        }
                        b[j-1] = true;
                    }
                }
            }
            System.out.println(isHeapifiable ? "YES" : "NO");
        }
    }
}