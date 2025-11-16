package RobiS_5520124028_PBOPrakP6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = sc.nextInt();

        int[] data = new int[n];
        int total = 0;

        System.out.println("Masukkan bilangan satu per satu:");

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Bilangan ke-" + (i+1) + ": ");
                data[i] = sc.nextInt();
                total += data[i];
            } 
            catch (Exception e) {
                System.out.println("Error: input bukan bilangan! Ulangi.");
                sc.nextLine();
                i--; 
            }
        }

        double rata = (double) total / n;
        System.out.println("\nRata-rata = " + rata);
    }
}
