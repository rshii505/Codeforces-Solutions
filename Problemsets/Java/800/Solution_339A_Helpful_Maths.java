// https://codeforces.com/problemset/problem/339/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Solution_339A_Helpful_Maths {
    public static void main(String[] args) throws IOException {
        //System.out.println(String.join("+", Arrays.sort(new BufferedReader(new InputStreamReader(System.in)).readLine().split("+"))));
        //idk why this doesnt work
        System.out.println(Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\+")).sorted().collect(Collectors.joining("+")));
    }
}
