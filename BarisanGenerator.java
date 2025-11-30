public class BarisanGenerator {
    // Metode yang menerima array sebagai parameter (pass-by-reference konsep)
    // Metode ini akan mengisi array dengan barisan angka dan menampilkannya
    public static void generateDanTampilkanBarisan(int[] barisan) {
        // Mulai dengan angka 6, lalu kalikan 2 setiap iterasi
        int nilaiAwal = 6;
        for (int i = 0; i < barisan.length; i++) {
            barisan[i] = nilaiAwal;  // Isi array (modifikasi objek asli)
            nilaiAwal *= 2;          // Kalikan 2 untuk angka berikutnya
        }
        
        // Tampilkan barisan
        System.out.print("Barisan angka: {");
        for (int i = 0; i < barisan.length; i++) {
            System.out.print(barisan[i]);
            if (i < barisan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        // Buat array kosong dengan ukuran 5 (sesuai barisan {6,12,24,48,96})
        int[] barisanAngka = new int[5];
        
        // Panggil metode dengan melewatkan array (pass-by-reference konsep)
        // Array akan dimodifikasi di dalam metode
        generateDanTampilkanBarisan(barisanAngka);
        
        // Verifikasi: Tampilkan isi array setelah metode dipanggil
        System.out.print("Isi array setelah modifikasi: [");
        for (int i = 0; i < barisanAngka.length; i++) {
            System.out.print(barisanAngka[i]);
            if (i < barisanAngka.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}