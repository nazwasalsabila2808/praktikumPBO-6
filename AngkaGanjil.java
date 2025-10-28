import java.util.Scanner;

public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input banyak angka
        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();

        int total = 0;
        System.out.print("Angka ganjil: ");
        
        // Menampilkan dan menjumlahkan angka ganjil
        // Angka ganjil ke-n bisa didapat dari rumus 2*n - 1
        for (int i = 1; i <= n; i++) {
            int angkaGanjil = 2 * i - 1;
            System.out.print(angkaGanjil + " ");
            total += angkaGanjil;
        }

        // Menampilkan total penjumlahan angka ganjil
        System.out.println("\nTotal penjumlahan : " + total);
        
        input.close();
    }
}