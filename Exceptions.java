import java.util.Scanner;

class InvalidUserException extends Exception {
    InvalidUserException(String message) {
        super(message);
    }
}

public class Exceptions {
    public static void main(String[] args) throws InvalidUserException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter monthly income: ");
            double income = sc.nextDouble();
            sc.nextLine(); // consume newline

            System.out.print("Enter city: ");
            String city = sc.nextLine();

            System.out.print("Do you have a 4-wheeler? (yes/no): ");
            String vehicle = sc.nextLine();

            // ✅ Use simple String to collect errors
            String errors = "";

            if (age < 18 || age > 55)
                errors += "• Age must be between 18 and 55.\n";

            if (income < 50000 || income > 100000)
                errors += "• Income must be between ₹50,000 and ₹1,00,000.\n";

            if (!(city.equalsIgnoreCase("Pune") || city.equalsIgnoreCase("Mumbai") ||
                  city.equalsIgnoreCase("Bangalore") || city.equalsIgnoreCase("Chennai")))
                errors += "• City must be Pune, Mumbai, Bangalore, or Chennai.\n";

            if (!vehicle.equalsIgnoreCase("yes"))
                errors += "• User must have a 4-wheeler.\n";

            if (!errors.equals("")) {
                throw new InvalidUserException("Validation failed:\n" + errors);
            }

            System.out.println("User meets all criteria. Access granted.");
        } finally {
            sc.close(); // close scanner
        }
    }
}
