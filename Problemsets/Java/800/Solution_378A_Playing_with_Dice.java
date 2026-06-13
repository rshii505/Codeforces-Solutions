// https://codeforces.com/problemset/problem/378/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_378A_Playing_with_Dice {
    public static void main(String[] args) throws IOException {
        StringTokenizer inpt = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte a = Byte.parseByte(inpt.nextToken());
        byte b = Byte.parseByte(inpt.nextToken());
        switch (a)
        {
            case 1 -> {
                switch (b)
                {
                    case 1 -> System.out.println("0 6 0");
                    case 2 -> System.out.println("1 0 5");
                    case 3 -> System.out.println("1 1 4");
                    case 4 -> System.out.println("2 0 4");
                    case 5 -> System.out.println("2 1 3");
                    case 6 -> System.out.println("3 0 3");
                }
            }
            case 2 -> {
                switch (b)
                {
                    case 1 -> System.out.println("5 0 1");
                    case 2 -> System.out.println("0 6 0");
                    case 3 -> System.out.println("2 0 4");
                    case 4 -> System.out.println("2 1 3");
                    case 5 -> System.out.println("3 0 3");
                    case 6 -> System.out.println("3 1 2");
                }
            }
            case 3 -> {
                switch (b)
                {
                    case 1 -> System.out.println("4 1 1");
                    case 2 -> System.out.println("4 0 2");
                    case 3 -> System.out.println("0 6 0");
                    case 4 -> System.out.println("3 0 3");
                    case 5 -> System.out.println("3 1 2");
                    case 6 -> System.out.println("4 0 2");
                }
            }
            case 4 -> {
                switch (b)
                {
                    case 1 -> System.out.println("4 0 2");
                    case 2 -> System.out.println("3 1 2");
                    case 3 -> System.out.println("3 0 3");
                    case 4 -> System.out.println("0 6 0");
                    case 5 -> System.out.println("4 0 2");
                    case 6 -> System.out.println("4 1 1");
                }
            }
            case 5 -> {
                switch (b)
                {
                    case 1 -> System.out.println("3 1 2");
                    case 2 -> System.out.println("3 0 3");
                    case 3 -> System.out.println("2 1 3");
                    case 4 -> System.out.println("2 0 4");
                    case 5 -> System.out.println("0 6 0");
                    case 6 -> System.out.println("5 0 1");
                }
            }
            case 6 -> {
                switch (b)
                {
                    case 1 -> System.out.println("3 0 3");
                    case 2 -> System.out.println("2 1 3");
                    case 3 -> System.out.println("2 0 4");
                    case 4 -> System.out.println("1 1 4");
                    case 5 -> System.out.println("1 0 5");
                    case 6 -> System.out.println("0 6 0");
                }
            }
        }
    }
}
