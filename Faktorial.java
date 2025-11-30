import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif untuk menghitung faktorial: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Faktorial tidak didefinisikan untuk bilangan negatif.");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
        
        scanner.close();
    }
}