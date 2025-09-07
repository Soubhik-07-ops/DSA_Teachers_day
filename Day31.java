import java.util.*;

public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        int groups = 1;
        for (int i = 1; i < n; i++) {
            String cur = sc.next();
            if (!cur.equals(prev)) {
                groups++;
            }
            prev = cur;
        }
        System.out.println(groups);
    }
}