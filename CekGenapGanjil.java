import java.util.Scanner;  // Import Scanner untuk input dari keyboard

public class CekGenapGanjil {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan bilangan
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();  // Membaca input sebagai integer
        
        // Struktur kontrol if-else untuk menentukan genap atau ganjil
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
        
        // Menutup Scanner
        input.close();
    }
}
