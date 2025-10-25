import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        System.out.println("Menu Perhitungan Luas Bangun Datar");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih bangun datar (1-5): ");
        pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1:
                // Luas Persegi
                System.out.print("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi: " + luasPersegi);
                break;
                
            case 2:
                // Luas Segitiga
                System.out.print("Masukkan alas segitiga: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga: " + luasSegitiga);
                break;
                
            case 3:
                // Luas Lingkaran
                System.out.print("Masukkan jari-jari lingkaran: ");
                double radius = input.nextDouble();
                double luasLingkaran = Math.PI * radius * radius;
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                break;
                
            case 4:
                // Luas Trapesium
                System.out.print("Masukkan sisi atas trapesium: ");
                double sisiAtas = input.nextDouble();
                System.out.print("Masukkan sisi bawah trapesium: ");
                double sisiBawah = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrap = input.nextDouble();
                double luasTrapesium = 0.5 * (sisiAtas + sisiBawah) * tinggiTrap;
                System.out.println("Luas Trapesium: " + luasTrapesium);
                break;
                
            case 5:
                // Luas Layang-layang
                System.out.print("Masukkan diagonal 1 layang-layang: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2 layang-layang: ");
                double d2 = input.nextDouble();
                double luasLayang = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang: " + luasLayang);
                break;
                
            default:
                System.out.println("Pilihan tidak tersedia!");
                break;
        }
        
        input.close();
    }
}