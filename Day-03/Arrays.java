public class Arrays {
    public static void main(String[] args) {

        // 1️⃣ Declare and Initialize Array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");
        
        // 2️⃣ Print Array using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        // 3️⃣ Find Sum of Array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);

        System.out.println();

        // 4️⃣ Find Maximum Element
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max = " + max);

        System.out.println();

        // 5️⃣ Reverse Array Print
        System.out.println("Reverse Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}