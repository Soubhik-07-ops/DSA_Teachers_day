import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // Capitalize only the first character, keep the rest unchanged
        String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);

        System.out.println(result);
    }
}