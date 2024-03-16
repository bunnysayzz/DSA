import java.util.Arrays;

public class Selection1 {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.println("Step " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        System.out.println("Original array: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}