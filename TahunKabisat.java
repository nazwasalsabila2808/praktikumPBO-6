import java.util.Scanner;  // Import Scanner untuk input dari keyboard

public class TahunKabisat {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan tahun
        System.out.print("Masukkan tahun : ");
        int tahun = input.nextInt();  // Membaca input sebagai integer
        
        // Struktur kontrol if-else untuk menentukan tahun kabisat
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }
        
        // Menutup Scanner
        input.close();
    }
}
