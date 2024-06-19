import java.util.*;

public class colLinked {
    public static void main(String[] args) {
        // We can do the same using LinkedList Class
        List<Integer> nums = new LinkedList<>();
        nums.add(45);
        nums.add(12);
        nums.add(11);

        // Print the list before sorting
        System.out.println("Before: " + nums);

        // Sort the list using Collections.sort
        Collections.sort(nums);

        // Print the list after sorting
        System.out.println("After: " + nums);
    }
}
