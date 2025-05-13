import java.io.*;
import java.util.Scanner;

public class SimpleFileHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create and write to a file
        try {
            System.out.print("Enter file name to create: ");
            String fileName = sc.nextLine();
            FileWriter writer = new FileWriter(fileName);

            System.out.println("Enter text (type 'end' in a new line to stop):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("end")) break;
                writer.write(line + "\n");
            }

            writer.close();
            System.out.println("File written successfully.");

            // Step 2: Read and count
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int charCount = 0, wordCount = 0, lineCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();

            // Step 3: Show result
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close(); // ✅ Fixes the resource leak warning
    
    }
}
