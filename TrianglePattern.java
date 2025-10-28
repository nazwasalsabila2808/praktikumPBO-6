public class TrianglePattern {
    public static void main(String[] args) {
        // Membuat Half Triangle
        System.out.println("Half Triangle");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle");
        // Membuat Full Triangle
        // Baris atas sampai tengah
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Baris bawah setelah tengah
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}