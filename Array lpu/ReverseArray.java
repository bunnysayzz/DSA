import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;
        int[] reversedArr = new int[n];
        Arrays.setAll(reversedArr, i -> arr[n - 1 - i]);

        System.arraycopy(reversedArr, 0, arr, 0, n);

        System.out.println(Arrays.toString(arr));
    }
}
