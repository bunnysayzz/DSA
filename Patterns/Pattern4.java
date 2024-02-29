import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}