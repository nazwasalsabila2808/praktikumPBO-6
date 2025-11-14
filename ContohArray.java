/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6praktikumpbonazwaa;

import java.util.Scanner; // Untuk input opsional

/**
 *
 * @author HP
 */
public class ContohArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input = new Scanner(System.in);
             int[] arr = new int[3];  // Inisialisasi dengan ukuran 3
             
             // Mengisi elemen dari input pengguna
             for (int i = 0; i < arr.length; i++) {
                 System.out.print("Masukkan nilai untuk elemen ke-" + (i+1) + ": ");
                 arr[i] = input.nextInt();
             }
             
             // Menampilkan array
             System.out.println("Array yang dibuat: ");
             for (int num : arr) {
                 System.out.print(num + " ");
             }
             input.close();
         }
     }
    
    

