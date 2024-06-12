public class InsertArr {

    // Function to print the array
    public static void printArray(int[] arr, int n_) {
        for (int i = 0; i < n_; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to insert an element at a specific index
    public static void insertAt(int[] arr, int n, int[] n_, int index, int val) {
        if (n == n_[0]) {
            System.out.println("Array is full");
            return;
        }
        if (index > n_[0]) {
            System.out.println("Trying to insert at invalid position");
            return;
        }

        for (int i = n_[0]; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = val;
        n_[0] += 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 0};
        int n = 11; // allocated size of the array
        int[] n_ = {6}; // used size of the the array (using an array to pass by reference)

        System.out.println("Initial array:");
        printArray(arr, n_[0]);

        int index = 2;
        int val = 9;
        insertAt(arr, n, n_, index, val);

        System.out.println("Updated Array:");
        printArray(arr, n_[0]);
    }
}
