import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // Convert both strings to lowercase to ignore case
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Compare lexicographically
        int comparison = s1.compareTo(s2);

        if (comparison < 0) {
            System.out.println(-1);
        } else if (comparison > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}