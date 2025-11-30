// Class untuk merepresentasikan persegi panjang
class PersegiPanjang {
    private double panjang;
    private double lebar;
    
    // Konstruktor untuk menginisiasi ukuran persegi panjang
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Method untuk menghitung luas persegi panjang
    public double hitungLuas() {
        return panjang * lebar;
    }
}

public class LuasWarnaHitam {
    // Method utama program
    public static void main(String[] args) {
        // Membuat objek persegi panjang besar dan kecil
        PersegiPanjang besar = new PersegiPanjang(10, 5);
        PersegiPanjang kecil = new PersegiPanjang(8, 4);

        // Menghitung luas bidang berwarna hitam
        double luasHitam = besar.hitungLuas() - kecil.hitungLuas();

        // Menampilkan hasil luas bidang berwarna hitam
        System.out.println("Luas bidang berwarna hitam adalah: " + luasHitam);
    }
}