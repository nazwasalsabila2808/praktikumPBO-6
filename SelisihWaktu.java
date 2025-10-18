/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selisih.waktu;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SelisihWaktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Input waktu pertama
        System.out.print("Masukkan waktu pertama (format HH:MM): ");
        String waktu1Str = scanner.nextLine();
        
        // Input waktu kedua
        System.out.print("Masukkan waktu kedua (format HH:MM): ");
        String waktu2Str = scanner.nextLine();
        
        try {
            // Parse string ke LocalTime
            LocalTime waktu1 = LocalTime.parse(waktu1Str);
            LocalTime waktu2 = LocalTime.parse(waktu2Str);
            
            // Hitung durasi
            Duration durasi = Duration.between(waktu1, waktu2);
            
            // Ekstrak jam, menit, detik
            long jam = durasi.toHours();
            long menit = durasi.toMinutes() % 60;
            long detik = durasi.getSeconds() % 60;
            
            // Tampilkan hasil
            System.out.println("Selisih waktu: " + jam + " jam, " + menit + " menit, " + detik + " detik.");
            
        } catch (Exception e) {
            System.out.println("Format waktu tidak valid. Gunakan format HH:MM (contoh: 14:30).");
        }
        
        scanner.close();
    }
}
    
    

