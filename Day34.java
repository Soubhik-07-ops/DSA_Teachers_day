import java.util.*;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int giver = sc.nextInt();
            p[giver] = i; // giver gave gift to i
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(p[i] + (i == n ? "" : " "));
        }
    }
}