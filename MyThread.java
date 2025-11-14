public class MyThread extends Thread {
    // Override method run, yang merupakan titik entri bagi thread baru
    @Override
    public void run() {
        // Kode yang akan dieksekusi oleh thread baru
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " - Iterasi: " + i);
            try {
                // Simulasi delay
                Thread.sleep(1000); // 1 detik
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Ciptakan objek dari kelas MyThread
        MyThread threadObj = new MyThread();
        
        // Panggil start untuk memulai eksekusi thread
        threadObj.start();
        
        // Main thread juga bisa menjalankan sesuatu
        System.out.println("Main thread selesai.");
    }
}