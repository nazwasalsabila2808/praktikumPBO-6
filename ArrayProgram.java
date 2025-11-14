import java.util.Scanner;
import java.util.Arrays;

public class ArrayProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Masukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        // b. Memasukkan nilai elemen sesuai jumlahnya
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-" + i + ": ");
            arr[i] = input.nextInt();
        }

        // c. Cari nilai terbesar, terkecil dan posisi indeksnya
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Nilai terbesar: " + max + ", pada indeks: " + maxIndex);
        System.out.println("Nilai terkecil: " + min + ", pada indeks: " + minIndex);

        // d. Jumlahkan semua data array dan cari rata-rata
        int total = 0;
        for (int val : arr) {
            total += val;
        }
        double rataRata = (double) total / n;
        System.out.println("Jumlah semua elemen: " + total);
        System.out.println("Nilai rata-rata: " + rataRata);

        // e. Jumlahkan elemen yang berindeks ganjil (indeks 1,3,5,...), NPM genap
        int jumlahIndeksGanjil = 0;
        for (int i = 1; i < n; i += 2) {
            jumlahIndeksGanjil += arr[i];
        }
        System.out.println("Jumlah elemen berindeks ganjil: " + jumlahIndeksGanjil);

        // f. Jumlahkan elemen yang berindeks genap (indeks 0,2,4,...), NPM ganjil
        int jumlahIndeksGenap = 0;
        for (int i = 0; i < n; i += 2) {
            jumlahIndeksGenap += arr[i];
        }
        System.out.println("Jumlah elemen berindeks genap: " + jumlahIndeksGenap);

        // g. Check hasil penjumlahan langkah d atau f apakah ganjil atau genap dan tampilkan hasilnya
        if (total % 2 == 0) {
            System.out.println("Jumlah semua elemen (langkah d) adalah GENAP.");
        } else {
            System.out.println("Jumlah semua elemen (langkah d) adalah GANJIL.");
        }

        if (jumlahIndeksGenap % 2 == 0) {
            System.out.println("Jumlah elemen berindeks genap (langkah f) adalah GENAP.");
        } else {
            System.out.println("Jumlah elemen berindeks genap (langkah f) adalah GANJIL.");
        }

        // h. Urutkan array dan tampilkan hasilnya
        Arrays.sort(arr);
        System.out.print("Array setelah diurutkan: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        input.close();
    }
}