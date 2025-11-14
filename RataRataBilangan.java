import java.util.ArrayList;
import java.util.Scanner;

public class RataRataBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> bilangan = new ArrayList<>();
        
        System.out.print("Masukkan jumlah bilangan yang akan dirata-ratakan: ");
        int jumlah = scanner.nextInt();
        
        System.out.println("Masukkan bilangan-bilangan:");
        for (int i = 0; i < jumlah; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Bilangan ke-" + (i + 1) + ": ");
                    double nilai = scanner.nextDouble();
                    bilangan.add(nilai);
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Input bukan bilangan! Silakan masukkan bilangan yang valid.");
                    scanner.nextLine(); // Bersihkan buffer
                }
            }
        }
        
        // Hitung rata-rata
        double total = 0;
        for (double nilai : bilangan) {
            total += nilai;
        }
        double rataRata = total / bilangan.size();
        
        // Cetak hasil
        System.out.println("Bilangan yang dimasukkan: " + bilangan);
        System.out.println("Rata-rata: " + rataRata);
        
        scanner.close();
    }
}