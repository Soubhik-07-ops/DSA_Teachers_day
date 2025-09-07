import java.util.*;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();

        for (int time = 0; time < t; time++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    // swap
                    arr[i] = 'G';
                    arr[i + 1] = 'B';
                    i++; // skip next to avoid double swap
                }
            }
        }

        System.out.println(new String(arr));
    }
}