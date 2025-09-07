import java.util.*;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int upper = 0, lower = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                upper++;
            else
                lower++;
        }

        if (upper > lower) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}