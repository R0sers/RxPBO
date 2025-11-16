
package RobiS_5520124028_PBOPrakP6;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); // biar enter nggak nyangkut

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = sc.nextLine();

            System.out.print("Nilai : ");
            nilai[i] = sc.nextInt();
            sc.nextLine();

            status[i] = (nilai[i] > 50) ? "Lulus" : "Tidak Lulus";
        }

        System.out.println("\n---------------------------------------------");
        System.out.println(" Daftar Nilai Mahasiswa ");
        System.out.println("---------------------------------------------");
        System.out.println("No\tNama\t\tNilai\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t\t" + nilai[i] + "\t" + status[i]);
        }
    }
}
