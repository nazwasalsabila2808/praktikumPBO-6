/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaya.sentripetal;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GayaSentripetal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Meminta input dari pengguna
        try ( // TODO code application logic here
        // Membuat objek Scanner untuk input
                Scanner scanner = new Scanner(System.in)) {
            // Meminta input dari pengguna
            System.out.print("Masukkan massa benda (kg): ");
            double M = scanner.nextDouble();
            System.out.print("Masukkan kecepatan benda (m/s): ");
            double v = scanner.nextDouble();
            System.out.print("Masukkan jari-jari lintasan (m): ");
            double r = scanner.nextDouble();
            // Menghitung gaya sentripetal
            double Fc = (M * Math.pow(v, 2)) / r;
            // Menampilkan hasil
            System.out.printf("Gaya sentripetal Fc = %.2f Newton%n", Fc);
            // Menutup scanner
        }
    }
}
    
    

