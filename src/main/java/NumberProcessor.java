import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three integers:");
        
        // Read three integers from input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Print all input numbers
        System.out.println("\nInput numbers:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        
        // Calculate and print sum
        int sum = num1 + num2 + num3;
        System.out.println("\nSum: " + sum);
        
        // Calculate and print average
        double average = (double) sum / 3;
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}
