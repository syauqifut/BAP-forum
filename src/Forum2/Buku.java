package Forum2;

public class Buku {
    private String title;
    private String author;

    public Buku(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        Buku[] bukus = new Buku[3];

        bukus[0] = new Buku("Belajar Membaca", "Ahmad");
        bukus[1] = new Buku("Belajar Menulis", "Syauqi");
        bukus[2] = new Buku("Belajar Mengoding", "Futtaqi");

        for (Buku buku : bukus) {
            System.out.println("Title: " + buku.getTitle());
            System.out.println("Author: " + buku.getAuthor());
            System.out.println();
        }
    }
}
