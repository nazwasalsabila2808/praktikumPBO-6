public class DisplayArray {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};
        
        // Perulangan pertama: Menggunakan for loop tradisional
        System.out.println("Menggunakan for loop tradisional:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }
        
        // Perulangan kedua: Menggunakan enhanced for loop (for-each)
        System.out.println("\nMenggunakan enhanced for loop (for-each):");
        for (int nilai : age) {
            System.out.println("Nilai: " + nilai);
        }
    }
}