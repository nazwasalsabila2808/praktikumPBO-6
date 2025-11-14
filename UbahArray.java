public class UbahArray {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array mobil
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        // Mencari indeks elemen yang bernilai "Suzuki"
        int indeksSuzuki = -1; // inisialisasi indeks
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                indeksSuzuki = i;
                break; // berhenti saat ketemu
            }
        }

        // Jika "Suzuki" ditemukan, ubah nilai pada indeks tersebut
        if (indeksSuzuki != -1) {
            mobil[indeksSuzuki] = "Nilai Baru"; // ubah sesuai kebutuhan
            // Tampilkan nilai pada indeks yang telah diubah
            System.out.println("Nilai pada indeks ke-" + indeksSuzuki + " setelah diubah: " 
                               + mobil[indeksSuzuki]);
        } else {
            System.out.println("\"Suzuki\" tidak ditemukan dalam array.");
        }
    }
}