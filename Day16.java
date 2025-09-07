import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = -1, col = -1;

        // Read the 5x5 matrix
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        // Target position is (3, 3)
        int moves = Math.abs(row - 3) + Math.abs(col - 3);
        System.out.println(moves);
    }
}