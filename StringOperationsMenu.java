import java.util.Scanner;

public class StringOperationsMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        int choice;

        System.out.print("Enter first string: ");
        str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        str2 = sc.nextLine();

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. charAt()");
            System.out.println("2. compareTo()");
            System.out.println("3. concat()");
            System.out.println("4. equals()");
            System.out.println("5. replace()");
            System.out.println("6. split()");
            System.out.println("7. trim()");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter index to get character: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < str1.length()) {
                        System.out.println("Character at index " + index + ": " + str1.charAt(index));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 2:
                    int result = str1.compareTo(str2);
                    System.out.println("compareTo result: " + result);
                    break;

                case 3:
                    String concatenated = str1.concat(str2);
                    System.out.println("Concatenated String: " + concatenated);
                    break;

                case 4:
                    boolean isEqual = str1.equals(str2);
                    System.out.println("Are strings equal? " + isEqual);
                    break;

                case 5:
                    System.out.print("Enter character/word to replace: ");
                    String oldStr = sc.nextLine();
                    System.out.print("Enter new character/word: ");
                    String newStr = sc.nextLine();
                    String replaced = str1.replace(oldStr, newStr);
                    System.out.println("Result after replace: " + replaced);
                    break;

                case 6:
                    System.out.print("Enter delimiter to split (e.g. space or comma): ");
                    String delimiter = sc.nextLine();
                    String[] parts = str1.split(delimiter);
                    System.out.println("Split result:");
                    for (String part : parts) {
                        System.out.println(part);
                    }
                    break;

                case 7:
                    String trimmed = str1.trim();
                    System.out.println("Trimmed string: '" + trimmed + "'");
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again!");
            }

        } while (choice != 8);

        sc.close();
    }
}
