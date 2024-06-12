public class maxRec {
    
    public static int rec(int n, int[] arr) {
        if (n == 0) {
            return 0;
        }
        
        int price = 0;
        for (int i = 1; i <= n; i++) {
            price = Math.max(price, arr[i] + rec(n - i, arr));
        }
        return price;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {0, 2, 3, 1, 4, 2, 7}; 
        int maxPrice = rec(n, arr);
        System.out.println("Max Price: " + maxPrice);
    }
}
