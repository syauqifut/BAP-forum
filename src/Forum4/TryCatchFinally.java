package Forum4;

public class TryCatchFinally {
    public static void main(String[] args) {
// blok try adalah tempat eksekusi program
        try {
            int[] arrayAngka = {0,1,2,3,4,5};
            //arithmatic exception
            // arrayAngka[5] = 30 / 0;
            //array index out of bound exception
            // arrayAngka[6] = 40;
            //exception
            // arrayAngka[7] = 50;
            System.out.println("Nilai pada index ke-5 adalah " + arrayAngka[5]);
// blok catch adalah tempat menangkap kesalahan, bisa lebih dari satu. Bisa custom exception dan default atau semua exception
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println("Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Exception: " + e);
        } catch (Exception e) {
            System.out.println("Exception");
// blok finally adalah tempat mengeksekusi program yang harus dijalankan, walaupun terjadi error
        } finally {
            System.out.println("Finally selalu muncul");
        }
    }
}
