import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // precompute
        int[] hash = new int[1000001];
        
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q = scanner.nextInt();
        while (q > 0) {
            int number = scanner.nextInt();
            // fetch operation
            System.out.println(hash[number]);
            q--; // Decrement q to eventually exit the loop
        }

        scanner.close();
    }
}
