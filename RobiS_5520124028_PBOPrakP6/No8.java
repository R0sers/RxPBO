package RobiS_5520124028_PBOPrakP6;
import java.util.Scanner;

class WorkerThread extends Thread {
    private int id;

    public WorkerThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread #" + id + " sedang berjalan...");
    }
}

public class No8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa thread yang ingin dibuat? ");
        int jumlah = sc.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            WorkerThread t = new WorkerThread(i);
            t.start();
        }

        System.out.println("Thread utama selesai membuat semua thread.");
    }
}
