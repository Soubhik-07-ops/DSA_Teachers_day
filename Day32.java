import java.util.*;

public class Day32 {
    static boolean isLucky(long x) {
        if (x == 0)
            return false;
        while (x > 0) {
            long d = x % 10;
            if (d != 4 && d != 7)
                return false;
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7')
                count++;
        }
        System.out.println(isLucky(count) ? "YES" : "NO");
    }
}