// Kelas Produk
class Produk {
    protected String judul;
    protected String penulis;

    // Constructor
    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

// Kelas Komik yang mewarisi Produk
class Komik extends Produk {
    
    public Komik(String judul, String penulis) {
        super(judul, penulis);
    }
    
    public String getInfoProduk() {
        return "Komik: " + judul + " | Penulis: " + penulis;
    }
}

// Kelas Games yang mewarisi Produk
class Games extends Produk {
    
    public Games(String judul, String penulis) {
        super(judul, penulis);
    }
    
    public String getInfoProduk() {
        return "Games: " + judul + " | Penulis: " + penulis;
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Komik komik1 = new Komik("One Piece", "Eiichiro Oda");
        Games games1 = new Games("Genshin Impact", "HoYoverse");

        // Memanggil method getInfoProduk
        System.out.println(komik1.getInfoProduk());
        System.out.println(games1.getInfoProduk());
    }
}