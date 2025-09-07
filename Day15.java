import java.util.*;

public class Day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        // Use a Set to count distinct characters
        Set<Character> distinct = new HashSet<>();
        for (char c : username.toCharArray()) {
            distinct.add(c);
        }

        // If distinct count is odd → male, even → female
        if (distinct.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}