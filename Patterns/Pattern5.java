import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            for (int j=0; j<5-i+1; j++){
                System.out.print(" ");
                }
            
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
                }
            
            for (int j=0; j<5-i+1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}