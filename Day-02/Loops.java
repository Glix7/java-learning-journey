public class Loops {
    public static void main(String[] args) {

        // 1️⃣ FOR LOOP
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println();

        // 2️⃣ WHILE LOOP
        System.out.println("While Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println();

        // 3️⃣ DO-WHILE LOOP
        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        System.out.println();

        // 4️⃣ REVERSE LOOP
        System.out.println("Reverse Loop:");
        for (int x = 5; x >= 1; x--) {
            System.out.println("x = " + x);
        }

        System.out.println();

        // 5️⃣ SIMPLE PATTERN
        System.out.println("Pattern:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}