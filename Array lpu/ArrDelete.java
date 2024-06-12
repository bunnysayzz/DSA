public class ArrDelete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 0};
        int n = 6;

        printArray(arr, n);

        int deleteIndex = 4;
        deleteAt(arr, n, deleteIndex);
        n--;

        printArray(arr, n);
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void deleteAt(int[] arr, int n, int index) {
        for (int i = index; i < n - 1 i++) {
            arr[i] = arr[i + 1];
        }
    }
}
