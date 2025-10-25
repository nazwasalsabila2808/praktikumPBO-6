import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input kondisi member dan total belanja
        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        String kartuMember = input.nextLine();

        System.out.print("Masukkan total belanja: Rp ");
        int totalBelanja = input.nextInt();

        System.out.print("Masukkan uang yang dibayarkan: Rp ");
        int uangBayar = input.nextInt();

        int diskon = 0;

        // Logika if-else untuk hitung diskon
        if (kartuMember.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        int totalBayar = totalBelanja - diskon;
        int kembalian = uangBayar - totalBayar;

        // Output hasil
        System.out.println("Total belanja: Rp " + totalBelanja);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp " + kembalian);
        } else {
            System.out.println("Uang yang dibayar kurang Rp " + (-kembalian));
        }

        input.close();
    }
}