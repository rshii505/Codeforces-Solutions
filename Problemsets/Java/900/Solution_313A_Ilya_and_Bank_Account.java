// https://codeforces.com/problemset/problem/313/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_313A_Ilya_and_Bank_Account {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(n >= 0 ? n : ((n % 10) < ((n % 100) / 10) ? (n / 10) : ((n / 100) * 10) + (n % 10)));
    }
}
