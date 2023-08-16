import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersExample {
    public static void findAndPrintDuplicateChars(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - Count: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "programming";
        String[] inputArray = { "apple", "banana", "apple", "cherry", "banana" };

        // Finding and printing duplicate characters in the string
        findAndPrintDuplicateChars(inputString);

        // Finding and printing duplicate strings in the string array
        Map<String, Integer> stringCountMap = new HashMap<>();
        System.out.println("\nDuplicate strings in the string array:");
        for (String str : inputArray) {
            stringCountMap.put(str, stringCountMap.getOrDefault(str, 0) + 1);
            if (stringCountMap.get(str) > 1) {
                System.out.println(str + " - Count: " + stringCountMap.get(str));
            }
        }
    }
}

