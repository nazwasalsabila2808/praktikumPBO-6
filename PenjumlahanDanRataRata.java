import java.util.Scanner;

public class PenjumlahanDanRataRata {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta jumlah bilangan yang akan dijumlahkan
        System.out.print("Masukkan jumlah bilangan yang akan dijumlahkan: ");
        int n = scanner.nextInt();
        
        // Inisialisasi variabel untuk menyimpan total jumlah
        int sum = 0;
        
        // Loop untuk menerima n bilangan dan menjumlahkannya
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = scanner.nextInt();
            sum += bilangan; // Menambahkan bilangan ke total
        }
        
        // Menghitung rata-rata (menggunakan double untuk presisi desimal)
        double rataRata = (double) sum / n;
        
        // Menutup scanner
        scanner.close();
        
        // Menampilkan hasil
        System.out.println("Total jumlah bilangan: " + sum);
        System.out.println("Rata-rata bilangan: " + rataRata);
    }
}