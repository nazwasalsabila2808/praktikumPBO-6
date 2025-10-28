import java.util.Scanner;

public class BilanganTerbesarTerkecil {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Inisialisasi variabel untuk menyimpan bilangan terbesar dan terkecil
        int max = Integer.MIN_VALUE; // Nilai terkecil yang mungkin untuk integer
        int min = Integer.MAX_VALUE; // Nilai terbesar yang mungkin untuk integer
        
        // Loop untuk menerima 10 bilangan
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = scanner.nextInt();
            
            // Periksa apakah bilangan ini lebih besar dari max
            if (bilangan > max) {
                max = bilangan;
            }
            
            // Periksa apakah bilangan ini lebih kecil dari min
            if (bilangan < min) {
                min = bilangan;
            }
        }
        
        // Menutup scanner
        scanner.close();
        
        // Menampilkan hasil
        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);
    }
}