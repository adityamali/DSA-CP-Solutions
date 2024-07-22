import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            System.out.println("i: " + i);
            System.out.println("nums[i]: " + nums[i]);
            System.out.println("index: " + index);
            System.out.println("nums[index]: " + nums[index]);

            // Check if the element at index is negative
            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                // Mark the element as visited by making it negative
                nums[index] = -nums[index];
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); // Output: [2, 3]
    }
}