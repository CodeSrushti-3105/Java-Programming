import java.util.Scanner;

class BankAccount {
    String customerName;
    String accountNumber;
    double balance;
    double interestRate;
    String contactNumber;
    String address;

    Scanner sc = new Scanner(System.in);

    void createAccount() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        System.out.print("Enter Rate of Interest (%): ");
        interestRate = sc.nextDouble();
        sc.nextLine(); // Consume leftover newline
        System.out.print("Enter Contact Number: ");
        contactNumber = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.println("Account Created Successfully!\n");
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Invalid or Insufficient Balance!");
        }
    }

    void computeInterest() {
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        double interest = (balance * interestRate * years) / 100;
        System.out.println("Interest for " + years + " years: " + interest);
    }

    void displayBalance() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice;

        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute Interest");
            System.out.println("5. Display Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.createAccount();
                    break;
                case 2:
                    account.deposit();
                    break;
                case 3:
                    account.withdraw();
                    break;
                case 4:
                    account.computeInterest();
                    break;
                case 5:
                    account.displayBalance();
                    break;
                case 6:
                    System.out.println("Exiting Application. Thank you!");
                    break;
                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
