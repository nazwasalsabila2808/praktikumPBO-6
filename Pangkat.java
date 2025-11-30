import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan basis (bilangan yang akan dipangkatkan): ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan eksponen (pangkat): ");
        int b = scanner.nextInt();
        
        if (b < 0) {
            System.out.println("Eksponen negatif tidak didukung dalam program ini (untuk menghindari bilangan pecahan).");
        } else {
            long hasil = 1;
            for (int i = 1; i <= b; i++) {
                hasil *= a;
            }
            System.out.println(a + " pangkat " + b + " adalah: " + hasil);
        }
        
        scanner.close();
    }
}