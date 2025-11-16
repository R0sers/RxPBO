
package RobiS_5520124028_PBOPrakP6;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread berjalan... step " + i);

            try {
                System.out.println("    ");
            } catch (Exception e) {
                System.out.println("Thread error!");
            }
        }
    }
}

public class No7 {
    public static void main(String[] args) {


        MyThread t1 = new MyThread();
        
        System.out.println("Menjalankan thread...");
        t1.start();  // WAJIB start(), bukan run()

        System.out.println("Main thread selesai memanggil start()");
        }
}
    
