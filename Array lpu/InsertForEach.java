public class InsertForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.print("Initial array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int index = 3;
        int value = 6;
        int[] newArr = insertAt(arr, index, value);

        System.out.print("Updated array:");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] insertAt(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];

        // Copy elements up to the index
        System.arraycopy(arr, 0, newArr, 0, index);

        // Insert the new value
        newArr[index] = value;

        // Copy the remaining elements
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);

        return newArr;
    }
}
