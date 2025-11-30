import java.util.Scanner;

public class KonversiBiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif untuk dikonversi ke biner: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Konversi biner hanya untuk bilangan non-negatif.");
        } else if (n == 0) {
            System.out.println("Bilangan 0 dalam biner adalah: 0");
        } else {
            StringBuilder biner = new StringBuilder();
            int temp = n;
            while (temp > 0) {
                biner.insert(0, temp % 2);  // Sisipan di depan untuk urutan benar
                temp /= 2;
            }
            System.out.println("Bilangan " + n + " dalam biner adalah: " + biner.toString());
        }
        
        scanner.close();
    }
}