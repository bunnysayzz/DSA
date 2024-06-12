public class ArrDelete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 0};
        int filledLength = 6;

        printArray(arr, filledLength);

        int deleteIndex = 4;
        deleteAt(arr, filledLength, deleteIndex);
        filledLength--;

        printArray(arr, filledLength);
    }

    public static void printArray(int[] arr, int filledLength) {
        for (int i = 0; i < filledLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void deleteAt(int[] arr, int filledLength, int index) {
        for (int i = index; i < filledLength - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
