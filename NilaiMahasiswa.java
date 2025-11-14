import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); // membersihkan input buffer

        String[] nama = new String[jumlahMahasiswa];
        int[] nilai = new int[jumlahMahasiswa];
        String[] status = new String[jumlahMahasiswa];

        // Input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();
            input.nextLine(); // membersihkan input buffer

            // Tentukan status lulus atau tidak
            if (nilai[i] > 50) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        // Tampilkan Daftar Nilai Mahasiswa
        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s %-20s %-7s %-12s%n", "No", "Nama", "Nilai", "Status");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-5d %-20s %-7d %-12s%n", (i+1), nama[i], nilai[i], status[i]);
        }

        input.close();
    }
}