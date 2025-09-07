import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Define vowels (both uppercase and lowercase)
        String vowels = "aoyeuiAOYEUI";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Skip vowels
            if (vowels.indexOf(c) != -1) {
                continue;
            }

            // Convert consonant to lowercase and prepend '.'
            result.append('.').append(Character.toLowerCase(c));
        }

        System.out.println(result.toString());
    }
}