import java.util.Scanner;
import calculator.CalculatorOperations;  // This is reference of that created package.

public class CalculatorApp {
    public static void main(String[] args) {
        // Create an instance of the CalculatorOperations class
        CalculatorOperations calc = new CalculatorOperations();

        Scanner sc = new Scanner(System.in);

        try {
            // Ask the user for input
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Ask user to choose operation
            System.out.println("Choose operation: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int choice = sc.nextInt();

            // Perform the chosen operation using a switch-case
            double result = 0;
            switch (choice) {
                case 1:
                    result = calc.add(num1, num2);
                    break;
                case 2:
                    result = calc.subtract(num1, num2);
                    break;
                case 3:
                    result = calc.multiply(num1, num2);
                    break;
                case 4:
                    result = calc.divide(num1, num2);
                    if (Double.isNaN(result)) {
                        System.out.println("Error: Cannot divide by zero.");
                        return; // Exit the program if division by zero occurs
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return; // Exit the program if an invalid option is selected
            }

            // Display the result
            System.out.println("Result: " + result);
        } finally {
            sc.close(); // Make sure the scanner is closed to prevent resource leak
        }
    }
}
