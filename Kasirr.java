import java.util.Scanner;

public class Kasirr {
    // Atribut
    private double hargaBarang;
    private int jumlahBarang;
    private double diskon; // Dalam persen (misalnya 10 untuk 10%)
    private double totalHarga;

    // Constructor 1: Hanya harga barang (jumlah = 1, diskon = 0)
    public Kasirr(double hargaBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = 1;
        this.diskon = 0;
        hitungTotalHarga();
    }

    // Constructor 2: Harga barang dan jumlah barang (diskon = 0)
    public Kasirr(double hargaBarang, int jumlahBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = 0;
        hitungTotalHarga();
    }

    // Constructor 3: Harga barang, jumlah barang, dan diskon
    public Kasirr(double hargaBarang, int jumlahBarang, double diskon) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = diskon;
        hitungTotalHarga();
    }

    // Metode untuk menghitung total harga
    private void hitungTotalHarga() {
        double subtotal = hargaBarang * jumlahBarang;
        this.totalHarga = subtotal - (diskon / 100 * subtotal);
    }

    // Metode untuk menampilkan detail
    public void tampilkanDetail() {
        System.out.println("Harga Barang: Rp" + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Total Harga: Rp" + totalHarga);
        System.out.println("-----------------------------");
    }

    // Main method untuk demonstrasi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Kasir - Pilih jenis input:");
        System.out.println("1. Hanya harga barang");
        System.out.println("2. Harga barang dan jumlah barang");
        System.out.println("3. Harga barang, jumlah barang, dan diskon");
        System.out.print("Pilih (1/2/3): ");
        int pilihan = scanner.nextInt();
        
        Kasirr kasirr = null;
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan harga barang: ");
                double harga = scanner.nextDouble();
                kasirr = new Kasirr(harga);
                break;
            case 2:
                System.out.print("Masukkan harga barang: ");
                harga = scanner.nextDouble();
                System.out.print("Masukkan jumlah barang: ");
                int jumlah = scanner.nextInt();
                kasirr = new Kasirr(harga, jumlah);
                break;
            case 3:
                System.out.print("Masukkan harga barang: ");
                harga = scanner.nextDouble();
                System.out.print("Masukkan jumlah barang: ");
                jumlah = scanner.nextInt();
                System.out.print("Masukkan diskon (%): ");
                double diskon = scanner.nextDouble();
                kasirr = new Kasirr(harga, jumlah, diskon);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }
        
        // Tampilkan hasil
        kasirr.tampilkanDetail();
        
        scanner.close();
    }
}
