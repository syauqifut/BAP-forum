package Forum3;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public static void main(String[] args) {
        // Membuat ArrayList untuk menampung objek Mahasiswa
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // Membuat objek Mahasiswa dan menambahkannya ke dalam ArrayList
        daftarMahasiswa.add(new Mahasiswa("Ahmad", 123456));
        daftarMahasiswa.add(new Mahasiswa("Syauqi", 1234567));
        daftarMahasiswa.add(new Mahasiswa("Futtaqi", 12345678));

        // Mengakses dan menampilkan data objek Mahasiswa dari ArrayList
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Nim: " + mahasiswa.getNim());
            System.out.println();
        }
    }
}
