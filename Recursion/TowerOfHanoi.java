public class TowerOfHanoi {
    public static void rec(int n, char from, char to, char help) {
        if (n == 0) {
            return;
        }
        rec(n-1, from, help, to);
        System.out.println("Moved disk " + n + " from rod " + from + " to rod " + to);
        rec(n-1, help, to, from);
    }

    public static void main(String[] args) {
        int n = 4; 
        rec(n, 'A', 'C', 'B'); 
    }
}
