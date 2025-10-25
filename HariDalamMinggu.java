import java.util.Scanner;

public class HariDalamMinggu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = scanner.nextInt();
        
        String namaHari;
        
        switch (kodeHari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Kode hari tidak valid. Masukkan angka 1-7.";
                break;
        }
        
        System.out.println("Nama hari: " + namaHari);
        
        scanner.close();
    }
}