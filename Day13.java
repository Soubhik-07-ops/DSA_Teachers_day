import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Split by "+" to get the numbers
        String[] parts = s.split("\\+");

        // Convert to integers for sorting
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        // Sort the numbers
        Arrays.sort(nums);

        // Build the output
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            result.append(nums[i]);
            if (i < nums.length - 1) {
                result.append("+");
            }
        }

        System.out.println(result.toString());
    }
}