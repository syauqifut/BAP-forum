package Forum4;

import java.io.File;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exception: ");
        System.out.println("1. ArithmeticException");
        System.out.println("2. NumberFormatException");
        System.out.println("3. NullPointerException");
        System.out.println("4. FileNotFoundException");
        System.out.println("5. ArrayIndexOutOfBoundsException");
        System.out.print("Pilih exception: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                arithmeticException();
                break;
            case 2:
                numberFormatException();
                break;
            case 3:
                nullPointerException();
                break;
            case 4:
                fileNotFoundException();
                break;
            case 5:
                arrayIndexOutOfBoundsException();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }

    public static void arithmeticException() {
        try {
            int angka = 10;
            int bagi = 0;
            int hasil = angka / bagi;
            System.out.println("Hasil dari " + angka + " / " + bagi + " adalah " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        }
    }

    public static void numberFormatException() {
        try {
            String angka = "ABC";
            int hasil = Integer.parseInt(angka);
            System.out.println("Angka adalah " + hasil);
        } catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan format angka: " + e.getMessage());
        }
    }

    public static void nullPointerException() {
        try {
            String huruf = null;
            System.out.println("Panjang huruf adalah" + huruf.length());
        } catch (NullPointerException e) {
            System.out.println("Terjadi kesalahan null: " + e.getMessage());
        }
    }

    public static void fileNotFoundException() {
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file); // Akan melempar FileNotFoundException
            // Melakukan operasi pada file
            scanner.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Terjadi kesalahan file: " + e.getMessage());
        }
    }

    public static void arrayIndexOutOfBoundsException() {
        try {
            int[] arrayAngka = {0,1,2,3,4};
            System.out.println("Nilai pada index ke-6 adalah " + arrayAngka[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan array: " + e.getMessage());
        }
    }
}
