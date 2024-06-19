import java.util.*;


public class colSort {
    public static void main(String[] args) {
        // using ArrayList Class 
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(23);
        nums.add(31);
        nums.add(21);

        System.out.println("Before"+nums);

        Collections.sort(nums);
        System.out.println("After"+nums);


    }
}