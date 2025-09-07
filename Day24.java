import java.util.*;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = k * w * (w + 1) / 2;
        int borrow = totalCost - n;
        System.out.println(Math.max(borrow, 0));
    }
}