package Forum1;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

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
