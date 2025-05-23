import java.util.Scanner;
import calculator.CalculatorOperations;

public class CalculatorApp {

    public static void main(String[] args) {
        CalculatorOperations calc = new CalculatorOperations();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEnter num1:");
            int num1 = sc.nextInt();

            System.out.println("Enter num2:");
            int num2 = sc.nextInt();

            System.out.println("Choose operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            choice = sc.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    result = calc.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = calc.sub(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = calc.mul(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    result = calc.div(num1, num2);
                    if (Double.isNaN(result)) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + result);
                    }
                    break;

                case 5:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
