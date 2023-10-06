package org.example.methods;

import java.time.LocalDateTime;

public class StringMethods {
    public static void main(String[] args) {

        // String concatenation for log entries or build messages
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // String Comparison
        // Comparing strings is crucial for tasks like user authentication.
        String expectedPassword = "password123";
        String userInput = "password123";
        boolean isAuthenticated = expectedPassword.equals(userInput); // Case-sensitive comparison
        System.out.println("Authentication: " + isAuthenticated);

        // String comparison case insensitive
        boolean isCaseInsensitiveEqual = expectedPassword.equalsIgnoreCase(userInput);
        System.out.println("Case-insensitive Authentication: " + isCaseInsensitiveEqual);

        // String Parsing
        // Parsing is the process of converting a string into a number.
        // Parsing strings is essential when dealing with user input, like converting a string to an integer.

        String numberStr = "42";
        int parsedNumber = Integer.parseInt(numberStr);
        System.out.println("Parsed Number: " + parsedNumber);

        // String Searching and Manipulation:
        // Searching for substrings and replacing text is common in text processing.

        String text = "Hello, world!";
        boolean containsHello = text.contains("Hello");
        String replacedText = text.replace("world", "Java");
        System.out.println("Contains 'Hello': " + containsHello);
        System.out.println("Replaced Text: " + replacedText);

        // String Splitting:
        //Splitting strings into arrays is useful for parsing CSV or other structured data.
        String data = "John,Doe,30";
        String[] dataArray = data.split(",");
        System.out.println("First Name: " + dataArray[0]);
        System.out.println("Last Name: " + dataArray[1]);
        System.out.println("Age: " + dataArray[2]);

        // String Formatting:
        //String formatting is used for creating formatted output, such as in log messages.
        String logMessage = String.format("This is a formatted log message. Current time is %s", LocalDateTime.now());
        System.out.println(logMessage);

        // StringBuilder for Dynamic String Building:
        //For efficient string concatenation in loops or when building long strings, StringBuilder is preferred.
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("world!");
        String result = stringBuilder.toString();
        System.out.println(result);

        StringBuilder stringBuilderForLoop = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilderForLoop.append("Number ").append(i).append(", ");
        }
        String resultOFStringBuildForLoop = stringBuilderForLoop.toString();
        System.out.println(resultOFStringBuildForLoop);

        // String Buffer:
        //String buffers are used for efficient string concatenation in loops or when building long strings.
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(", ");
        stringBuffer.append("world!");
        String resultOfStringBuffer = stringBuffer.toString();
        System.out.println(resultOfStringBuffer);

        // Substring Extraction:
        String subStringText = "Hello, World!";
        String subText = subStringText.substring(0, 5); // Extracts "Hello"
        System.out.println("subText = " + subText);
        // String Modification using trim() method
        String original = "   Trim me!   ";
        String trimmed = original.trim(); // Removes leading and trailing whitespace
        System.out.println("trimmed = " + trimmed);

        // String Interning:
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); // true // Comparing string references
        System.out.println(str1 == str3); // false // Comparing string references
        str3 = str3.intern();
        System.out.println(str1 == str3); // true // Comparing string references

        // charAt() method:
        String str = "Hello";
        System.out.println(str.charAt(0));

        // length indexOf lastIndexOf isBlank isEmpty lines() startsWith endsWith
        String strMethods = "Hello";
        System.out.println(strMethods.length());
        System.out.println(strMethods.indexOf("l"));
        System.out.println(strMethods.lastIndexOf("l"));
        System.out.println(strMethods.isBlank());
        System.out.println(strMethods.isEmpty());
        System.out.println(strMethods.lines());
        System.out.println(strMethods.startsWith("H"));
        System.out.println(strMethods.endsWith("l"));
        strMethods.lines().forEach(System.out::println); // lines() returns a Stream<String>
    }
}

































