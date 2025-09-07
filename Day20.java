import java.util.*;

public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        String reversed = new StringBuilder(s).reverse().toString();
        if (reversed.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}