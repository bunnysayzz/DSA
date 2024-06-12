public class Parenthesis {
    public static void rec(int n, int open, int close, String string) {
        if (open + close == 2 * n) {
            System.out.println(string);
        }

        if (open < n) {
            rec(n, open + 1, close, string + "{");
        }
        if (close < open) {
            rec(n, open, close + 1, string + "}");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int open = 0;
        int close = 0;
        rec(n, open, close, "");
    }
}
