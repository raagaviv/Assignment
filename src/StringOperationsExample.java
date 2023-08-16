public class StringOperationsExample {
    public static void main(String[] args) {
        // Creating a String
        String str1 = "Hello, ";
        String str2 = "world!";

        // Concatenation
        String result1 = str1.concat(str2);
        System.out.println("Concatenation: " + result1);

        // Length
        int length = result1.length();
        System.out.println("Length: " + length);

        // Substring
        String substring = result1.substring(7);
        System.out.println("Substring: " + substring);

        // Index of a character
        int index = result1.indexOf('o');
        System.out.println("Index of 'o': " + index);

        // Uppercase and lowercase
        String uppercase = result1.toUpperCase();
        String lowercase = result1.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
    }
}
