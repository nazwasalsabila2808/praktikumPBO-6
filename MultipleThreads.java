import java.util.ArrayList;
import java.util.Scanner;

public class MultipleThreads extends Thread {
    private int threadId;

    // Konstruktor untuk memberikan ID thread
    public MultipleThreads(int id) {
        this.threadId = id;
    }

    // Override method run
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadId + " - Iterasi: " + i);
            try {
                Thread.sleep(1000); // Delay 1 detik
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadId + " interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah thread yang ingin dibuat: ");
        int jumlahThread = scanner.nextInt();
        
        // Buat list untuk menyimpan thread
        ArrayList<MultipleThreads> threads = new ArrayList<>();
        
        // Buat dan mulai thread sebanyak yang diminta
        for (int i = 1; i <= jumlahThread; i++) {
            MultipleThreads thread = new MultipleThreads(i);
            threads.add(thread);
            thread.start(); // Mulai eksekusi thread
        }
        
        // Tunggu semua thread selesai (opsional, untuk demo)
        for (MultipleThreads thread : threads) {
            try {
                thread.join(); // Tunggu thread selesai
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }
        
        System.out.println("Semua thread telah selesai. Main thread selesai.");
        
        scanner.close();
    }
}