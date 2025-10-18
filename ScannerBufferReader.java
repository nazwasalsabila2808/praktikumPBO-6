/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerbufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ScannerBufferReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Contoh menggunakan Scanner: Mudah untuk parsing tipe data
        System.out.println("=== Menggunakan Scanner ===");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama (String): ");
            String nama = scanner.nextLine();  // Membaca seluruh baris
            System.out.print("Masukkan umur (int): ");
            int umur = scanner.nextInt();     // Parsing otomatis ke int
            System.out.println("Nama: " + nama + ", Umur: " + umur);
        }

        // Contoh menggunakan BufferedReader: Manual parsing, lebih efisien untuk baris besar
        System.out.println("\n=== Menggunakan BufferedReader ===");
        try {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Masukkan baris teks: ");
                String baris = br.readLine();  // Membaca seluruh baris sebagai String
                System.out.println("Baris yang dibaca: " + baris);
                // Parsing manual: Misalnya, ambil angka dari baris
                String[] parts = baris.split(" ");
                if (parts.length > 0) {
                    try {
                        int angka = Integer.parseInt(parts[0]);  // Konversi manual
                        System.out.println("Angka pertama: " + angka);
                    } catch (NumberFormatException e) {
                        System.out.println("Tidak ada angka valid di baris.");
                    }
                }
            }
        } catch (IOException e) {
        }

        // Opsional: Membaca dari file untuk menunjukkan efisiensi BufferedReader pada data besar
        System.out.println("\n=== Membaca dari file (BufferedReader lebih efisien) ===");
        try {
            try (BufferedReader fileReader = new BufferedReader(new FileReader("contoh.txt")) // Asumsikan file ada
            ) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    System.out.println("Baris dari file: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("File tidak ditemukan atau error I/O. Buat file 'contoh.txt' untuk test.");

        }
        
    }
}
    

