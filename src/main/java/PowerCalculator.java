import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        
        // Read the input number
        System.out.print("Input: ");
        double a = scanner.nextDouble();
        
        // Calculate a^5
        double result = Math.pow(a, 5);
        
        // Print input and output
        System.out.println("Input: " + a);
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}
