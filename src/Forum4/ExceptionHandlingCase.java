package Forum4;

import java.util.Scanner;

public class ExceptionHandlingCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan panjang: ");
            int p = scanner.nextInt();
            System.out.print("Masukkan lebar: ");
            int l = scanner.nextInt();
            int result = hitungLuasPersegiPanjang(p, l);
            System.out.println("Luas dari panjang " + p + " dan lebar " + l + " adalah " + result);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan : " + e.getMessage());
        }
    }

    public static int hitungLuasPersegiPanjang(int p, int l) {
        //exception lebih dari 0
        if (p < 0 || l < 0) {
            throw new IllegalArgumentException("Nilai parameter tidak boleh kurang dari 0");
        }
        int luas = p * l;
        return luas;
    }
}
