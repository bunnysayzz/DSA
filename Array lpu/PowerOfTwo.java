public class PowerOfTwo {

    public static void main(String[] args) {
        int n = 5;
        int result = powerOfTwo(n);
        System.out.println("2 to the power of " + n + " is: " + result);
    }

    public static int powerOfTwo(int n) {
        // Base case: 2^0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: 2^n is 2 * 2^(n-1)
        return 2 * powerOfTwo(n - 1);
    }
}
