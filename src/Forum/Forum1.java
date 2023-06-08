package Forum;

import java.util.Scanner;

public class Forum1 {
    public static void inputScanner() {
        Scanner scanner = new Scanner(System.in);

        //input string
        // String: Menggunakan scanner.nextLine() untuk membaca variable berupa string atau kalimat.
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("You entered: " + inputString);

        //input int
        // int: Menggunakan scanner.nextInt() untuk membaca variable berupa angka bulat.
        System.out.println("Enter an integer: ");
        int inputInt = scanner.nextInt();
        System.out.println("You entered: " + inputInt);

        //input boolean
        // boolean: Menggunakan scanner.nextBoolean() untuk membaca variable berupa boolean, yaitu true atau false.
        System.out.println("Enter a boolean(true/false): ");
        boolean inputBoolean = scanner.nextBoolean();
        System.out.println("You entered: " + inputBoolean);

    }
}
