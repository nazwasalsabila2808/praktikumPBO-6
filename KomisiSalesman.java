import java.util.Scanner;

public class KomisiSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input penjualan harian
        System.out.print("Masukkan total penjualan hari ini (dalam Rupiah): ");
        double penjualan = input.nextDouble();

        double uangJasa = 0;
        double komisi = 0;
        double totalPendapatan = 0;

        // Logika menentukan uang jasa dan komisi
        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }

        totalPendapatan = uangJasa + komisi;

        // Output hasil perhitungan
        System.out.println("\nRincian Pendapatan Salesman:");
        System.out.printf("Uang Jasa: Rp %.2f%n", uangJasa);
        System.out.printf("Komisi: Rp %.2f%n", komisi);
        System.out.printf("Total Pendapatan: Rp %.2f%n", totalPendapatan);

        input.close();
    }
}