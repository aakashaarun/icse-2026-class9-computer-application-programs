import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept user inputs
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter rate of interest (in %): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        
        // Calculate simple interest and amount
        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;
        
        // Print all inputs and outputs
        System.out.println("\n--- Input Values ---");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        
        System.out.println("\n--- Output Results ---");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        
        scanner.close();
    }
}
