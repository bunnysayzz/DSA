public class ArrUpdate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 0};
        int n = 6;

        printArray(arr, n);

        int updateIndex = 4;
        updateValueAt(arr, updateIndex, 8);

        printArray(arr, n); 
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void updateValueAt(int[] arr, int index, int value) {
        arr[index] = value;
    }
}
