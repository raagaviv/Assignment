import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExtractor {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\raagaviv\\IdeaProjects\\practice\\src\\input.txt";   // Path to input text file
        String outputFilePath = "C:\\Users\\raagaviv\\IdeaProjects\\practice\\src\\output.txt"; // Path to output text file

        try {
            // Read input text file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();

            // Regular expression patterns for numbers and special characters
            String numberPattern = "\\d+";
            String specialCharPattern = "[^a-zA-Z0-9\\s]";

            // Create pattern objects
            Pattern numPattern = Pattern.compile(numberPattern);
            Pattern charPattern = Pattern.compile(specialCharPattern);

            // Create matcher objects
            Matcher numMatcher = numPattern.matcher(content);
            Matcher charMatcher = charPattern.matcher(content);

            // Extract numbers and special characters
            StringBuilder numbers = new StringBuilder();
            StringBuilder specialChars = new StringBuilder();

            while (numMatcher.find()) {
                numbers.append(numMatcher.group()).append(" ");
            }

            while (charMatcher.find()) {
                specialChars.append(charMatcher.group()).append(" ");
            }

            // Write results to output text file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write("Numbers: " + numbers.toString());
            writer.newLine();
            writer.write("Special Characters: " + specialChars.toString());
            writer.close();

            System.out.println("Extraction complete. Results written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

