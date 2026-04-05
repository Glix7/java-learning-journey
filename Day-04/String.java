public class String {
    public static void main(String[] args) {
        // ========== 1. String Declaration and Initialization ==========
        java.lang.String name = "Java";
        java.lang.String message = new java.lang.String("Hello World");
        
        System.out.println("=== String Basics ===");
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
        
        // ========== 2. String Length ==========
        System.out.println("\n=== String Length ===");
        java.lang.String text = "Learning Java";
        System.out.println("Text: " + text);
        System.out.println("Length: " + text.length());
        
        // ========== 3. String Methods ==========
        System.out.println("\n=== String Methods ===");
        java.lang.String str = "Hello Java";
        
        // Case conversion
        System.out.println("Original: " + str);
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Character at index
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at index 6: " + str.charAt(6));
        
        // Substring
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("Substring (6): " + str.substring(6));
        
        // ========== 4. String Searching ==========
        System.out.println("\n=== String Searching ===");
        java.lang.String sentence = "Java is great and Java is powerful";
        
        // indexOf - first occurrence
        System.out.println("First 'Java' index: " + sentence.indexOf("Java"));
        System.out.println("First 'is' index: " + sentence.indexOf("is"));
        
        // lastIndexOf - last occurrence
        System.out.println("Last 'Java' index: " + sentence.lastIndexOf("Java"));
        
        // contains - check if substring exists
        System.out.println("Contains 'great': " + sentence.contains("great"));
        System.out.println("Contains 'bad': " + sentence.contains("bad"));
        
        // ========== 5. String Comparison ==========
        System.out.println("\n=== String Comparison ===");
        java.lang.String str1 = "Hello";
        java.lang.String str2 = "Hello";
        java.lang.String str3 = new java.lang.String("Hello");
        java.lang.String str4 = "hello";
        
        // equals - content comparison (case sensitive)
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));
        
        // equalsIgnoreCase - case insensitive
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4));
        
        // compareTo - lexicographic comparison
        System.out.println("'Apple'.compareTo('Banana'): " + "Apple".compareTo("Banana"));
        System.out.println("'Banana'.compareTo('Apple'): " + "Banana".compareTo("Apple"));
        System.out.println("'Hello'.compareTo('Hello'): " + "Hello".compareTo("Hello"));
        
        // ========== 6. String Replacement ==========
        System.out.println("\n=== String Replacement ===");
        java.lang.String original = "The quick brown fox jumps";
        
        // replace - replace all occurrences
        System.out.println("Original: " + original);
        System.out.println("Replace 'quick' with 'slow': " + original.replace("quick", "slow"));
        System.out.println("Replace 'o' with '0': " + original.replace("o", "0"));
        
        // replaceAll - using regex
        java.lang.String numbers = "Java 123 Programming 456";
        System.out.println("Original: " + numbers);
        System.out.println("Replace digits: " + numbers.replaceAll("[0-9]", "X"));
        
        // ========== 7. String Trimming ==========
        System.out.println("\n=== String Trimming ===");
        java.lang.String withSpaces = "   Hello World   ";
        System.out.println("Original: '" + withSpaces + "'");
        System.out.println("After trim(): '" + withSpaces.trim() + "'");
        
        // ========== 8. String Splitting ==========
        System.out.println("\n=== String Splitting ===");
        java.lang.String csv = "Apple,Banana,Cherry,Date";
        System.out.println("Original: " + csv);
        java.lang.String[] fruits = csv.split(",");
        System.out.println("Split by comma:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("  [" + i + "] " + fruits[i]);
        }
        
        // ========== 9. String Joining ==========
        System.out.println("\n=== String Joining ===");
        java.lang.String[] colors = {"Red", "Green", "Blue"};
        java.lang.String joined = java.lang.String.join(" - ", colors);
        System.out.println("Joined: " + joined);
        
        // ========== 10. StringBuilder (for mutable strings) ==========
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        System.out.println("Result: " + sb.toString());
        
        // StringBuilder is efficient for concatenation in loops
        StringBuilder sb2 = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb2.append("Day ").append(i).append(", ");
        }
        System.out.println("Loop result: " + sb2.toString());
        
        // ========== 11. String Conversion ==========
        System.out.println("\n=== String Conversion ===");
        int number = 42;
        double decimal = 3.14;
        boolean flag = true;
        
        java.lang.String numStr = java.lang.String.valueOf(number);
        java.lang.String decStr = java.lang.String.valueOf(decimal);
        java.lang.String boolStr = java.lang.String.valueOf(flag);
        
        System.out.println("Number to String: " + numStr);
        System.out.println("Double to String: " + decStr);
        System.out.println("Boolean to String: " + boolStr);
        
        // ========== 12. Check String Properties ==========
        System.out.println("\n=== String Properties ===");
        java.lang.String checkStr = "Hello123";
        
        // Check if empty
        System.out.println("isEmpty: " + checkStr.isEmpty());
        System.out.println("''.isEmpty(): " + "".isEmpty());
        
        // Starts and ends with
        System.out.println("Starts with 'Hello': " + checkStr.startsWith("Hello"));
        System.out.println("Ends with '123': " + checkStr.endsWith("123"));
    }
}
