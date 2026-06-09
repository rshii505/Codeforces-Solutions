// https://codeforces.com/problemset/problem/344/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_344A_Magnets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        char mag = br.readLine().charAt(0);
        while(--n != 0)
        {
            char nxtmag = br.readLine().charAt(0);
            if(mag != nxtmag)
            {
                ++cnt;
                mag = nxtmag;
            }
        }
        System.out.println(cnt);
    }
}
