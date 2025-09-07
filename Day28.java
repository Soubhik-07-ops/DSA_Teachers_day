import java.util.*;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++)
            h[i] = sc.nextInt();

        int best = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            int left = i;
            while (left - 1 >= 0 && h[left - 1] <= h[left]) {
                count++;
                left--;
            }
            int right = i;
            while (right + 1 < n && h[right + 1] <= h[right]) {
                count++;
                right++;
            }
            best = Math.max(best, count);
        }
        System.out.println(best);
    }
}