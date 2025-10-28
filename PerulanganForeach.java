public class PerulanganForeach {
    public static void main(String[] args) {
        // Definisi array dengan beberapa nilai contoh
        int[] myArray = {10, 20, 30, 40, 50};
        
        System.out.println("Menampilkan semua nilai dalam array menggunakan perulangan foreach:");
        
        // Perulangan foreach untuk menampilkan setiap nilai
        for (int value : myArray) {
            System.out.println(value);
        }
    }
}