import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyak baris : ");
        int n = scanner.nextInt();

        int angka = 1; // Angka mulai dari 1

        for (int i = 1; i <= n; i++) {  // Untuk setiap baris
            for (int j = 1; j <= i; j++) { // Jumlah angka sesuai nomor baris
                System.out.print(angka + " ");
                angka++; // Increment angka
            }
            System.out.println(); // Pindah baris
        }

        scanner.close();
    }
}