import java.io.*;
import java.util.Scanner;

public class FileStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int charCount = 0, wordCount = 0, lineCount = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();  // count characters
                String[] words = line.trim().split("\\s+"); // split by whitespace
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }

        sc.close();
    }
}
