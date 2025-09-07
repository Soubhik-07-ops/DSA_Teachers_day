import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int kthScore = scores[k - 1]; // score of k-th place (1-based index)
        int count = 0;

        for (int score : scores) {
            if (score >= kthScore && score > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}