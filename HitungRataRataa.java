import java.util.Scanner;

// Kelas untuk menyimpan hasil perhitungan rata-rata
class NilaiRataRata {
    private double rataRata;
    private int jumlah;
    private double total;

    // Constructor
    public NilaiRataRata(double rataRata, int jumlah, double total) {
        this.rataRata = rataRata;
        this.jumlah = jumlah;
        this.total = total;
    }

    // Metode untuk menampilkan detail
    public void tampilkanDetail() {
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Jumlah nilai: " + jumlah);
        System.out.println("Total: " + total);
    }
}

public class HitungRataRata {
    private double[] nilai;

    // Constructor yang menerima sejumlah nilai (menggunakan varargs untuk fleksibilitas)
    public HitungRataRata(double... nilai) {
        this.nilai = nilai;
    }

    // Metode yang menghitung rata-rata dan mengembalikan objek NilaiRataRata
    public NilaiRataRata hitungRataRata() {
        if (nilai.length == 0) {
            return new NilaiRataRata(0, 0, 0); // Jika tidak ada nilai, rata-rata 0
        }
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        double rataRata = total / nilai.length;
        return new NilaiRataRata(rataRata, nilai.length, total);
    }

    // Main method untuk demonstrasi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah nilai yang akan dihitung rata-ratanya: ");
        int jumlah = scanner.nextInt();
        
        double[] inputNilai = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            inputNilai[i] = scanner.nextDouble();
        }
        
        // Buat objek HitungRataRata dengan nilai yang dimasukkan
        HitungRataRata kalkulator = new HitungRataRata(inputNilai);
        
        // Panggil metode yang mengembalikan objek
        NilaiRataRata hasil = kalkulator.hitungRataRata();
        
        // Tampilkan hasil menggunakan objek yang dikembalikan
        System.out.println("\nHasil Perhitungan:");
        hasil.tampilkanDetail();
        
        scanner.close();
    }
}
