  
import java.util.Scanner;


public class Gaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         
        //deklarasi variabel
        String nik, nama, stskawin;
        int kdgol;
        double gapok, jmlanak;
        double tnjpas, tnjanak;
        double gaber = 0;  // Deklarasikan gaber sebagai double di luar if-else
        
        //masukan data//
        System.out.print("Masukan NIK Karyawan :");
        nik = input.next();
        System.out.print("Masukan Nama Karyawan :");
        nama = input.next();
        System.out.print("Masukan kode golongan[1/2/3/4] :");
        kdgol = input.nextInt();
        
        if (kdgol == 1) {
            stskawin = "Menikah";
            gapok = 1200000;
            tnjpas = 0.1 * gapok;
            gaber = gapok + tnjpas;
            
        } else if (kdgol == 2) {
            stskawin = "Belum Menikah";
            gapok = 1500000;
            tnjpas = 0;
            gaber = gapok + tnjpas;
            
        } else if (kdgol == 3) {
            stskawin = "Cerai";
            gapok = 1750000;
            tnjpas = 0.1 * gapok;
            gaber = gapok + tnjpas;
            
        } else if (kdgol == 4) {
            stskawin = "Menikah dan Punya Anak";
            gapok = 2000000;
            
            System.out.print("Masukan jumlah anak :");  
            jmlanak = input.nextInt();
            
            tnjanak = (0.5 * gapok) * jmlanak;
            tnjpas = 0.1 * gapok;
            gaber = gapok + tnjpas + tnjanak;
        } else {
            stskawin = "Tidak Kode Golongan";
            gapok = 0;
            gaber = 0;  // Set gaber ke 0 untuk golongan tidak valid
        }
        
        System.out.println("=====Ini Adalah Output=====");
        System.out.println("Nik Karyawan : " + nik);
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Kode golongan : " + kdgol);
        System.out.println("Status Kawin : " + stskawin);
        System.out.println("Gaji Pokok : " + gapok);
        System.out.println("Gaji Bersih : " + gaber);  // Cetak gaber sebagai double
            
        input.close();  // Tambahkan untuk menutup Scanner
    }
}
