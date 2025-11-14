import java.util.Scanner;

public class PenjumlahanMatriks {
    // Fungsi untuk membuat matriks berdasarkan input pengguna
    public static double[][] buatMatriks(int baris, int kolom, String namaMatriks, Scanner scanner) {
        double[][] matriks = new double[baris][kolom];
        System.out.println("Masukkan elemen-elemen matriks " + namaMatriks + " (" + baris + "x" + kolom + "):");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriks[i][j] = scanner.nextDouble();
            }
        }
        return matriks;
    }

    // Fungsi untuk menjumlahkan dua matriks
    public static double[][] jumlahMatriks(double[][] A, double[][] B) {
        int baris = A.length;
        int kolom = A[0].length;
        double[][] hasil = new double[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = A[i][j] + B[i][j];
            }
        }
        return hasil;
    }

    // Fungsi untuk mencetak matriks
    public static void cetakMatriks(double[][] matriks, String nama) {
        System.out.println("Matriks " + nama + ":");
        for (double[] baris : matriks) {
            for (double elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah baris dan kolom
        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = scanner.nextInt();
        
        // Buat matriks A dan B
        double[][] A = buatMatriks(baris, kolom, "A", scanner);
        double[][] B = buatMatriks(baris, kolom, "B", scanner);
        
        // Hitung penjumlahan
        double[][] C = jumlahMatriks(A, B);
        
        // Cetak hasil
        cetakMatriks(A, "A");
        cetakMatriks(B, "B");
        cetakMatriks(C, "Hasil Penjumlahan (A + B)");
        
        scanner.close();
    }
}