import java.util.Scanner;
public class declareArrays {
    public static void main ( String args[]) {
    Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.println("Write the elements of array:");
        for (int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The elements of array are:");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
                }
    }
}