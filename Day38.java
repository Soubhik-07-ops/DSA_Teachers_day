import java.util.*;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++)
            scores[i] = sc.nextInt();

        int min = scores[0], max = scores[0], amazing = 0;
        for (int i = 1; i < n; i++) {
            if (scores[i] > max) {
                amazing++;
                max = scores[i];
            } else if (scores[i] < min) {
                amazing++;
                min = scores[i];
            }
        }
        System.out.println(amazing);
    }
}