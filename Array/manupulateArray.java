import java.util.Scanner;

public class manupulateArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        arr[0] = 10;
        arr[1] = 20;

        for (int i = 2; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}