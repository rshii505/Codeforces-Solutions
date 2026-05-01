// https://codeforces.com/problemset/problem/44/A
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Solution_44A_Indian_Summer {
    public static void main(String[] args) {
      Set<String> leaves = new HashSet<>();
      Scanner sc = new Scanner(System.in);
      byte n = sc.nextByte();
      sc.nextLine();
      while(n-- != 0)
        leaves.add(sc.nextLine());
      System.out.println(leaves.size());
    }
}