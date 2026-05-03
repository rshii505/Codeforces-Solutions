// https://codeforces.com/problemset/problem/45/A
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Solution_45A_Codecraft_III {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      List<String> mnths = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
      System.out.println(mnths.get((mnths.indexOf(sc.next()) + sc.nextByte()) % 12));
    }
}