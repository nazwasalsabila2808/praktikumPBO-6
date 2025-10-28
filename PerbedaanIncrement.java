public class PerbedaanIncrement {
    public static void main(String[] args) {
        System.out.println("Perbedaan antara i++ (post-increment) dan ++i (pre-increment) dalam perulangan while:");
        
        // Contoh dengan i++ (post-increment)
        System.out.println("\nMenggunakan i++ (post-increment):");
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");  // Cetak nilai i saat ini, lalu increment
            i++;
        }
        System.out.println();  // Baris baru
        
        // Reset i untuk contoh kedua
        i = 0;
        
        // Contoh dengan ++i (pre-increment)
        System.out.println("\nMenggunakan ++i (pre-increment):");
        while (i < 5) {
            System.out.print(++i + " ");  // Increment dulu, lalu cetak nilai baru
        }
        System.out.println();  // Baris baru
        
        System.out.println("\nPenjelasan:");
        System.out.println("- Dengan i++: Nilai dicetak sebelum increment, sehingga dimulai dari 0.");
        System.out.println("- Dengan ++i: Increment dilakukan dulu, lalu nilai dicetak, sehingga dimulai dari 1.");
    }
}