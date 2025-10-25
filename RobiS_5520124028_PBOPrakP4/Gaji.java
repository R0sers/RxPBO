
package RobiS_5520124028_PBOPrakP4;

import java.util.Scanner;

public class Gaji {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String NIK, nama;
        int kodeGolongan, jumlahAnak;
        double gajiPokok = 0, tunjPasangan = 0, tunjAnak = 0, gajiBersih;

        System.out.println("=== Program Hitung Gaji Bersih Karyawan ===");
        System.out.print("Masukkan NIK: ");
        NIK = input.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        kodeGolongan = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        jumlahAnak = input.nextInt();

        switch (kodeGolongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                return;
        }

        if (kodeGolongan == 1 || kodeGolongan == 4) {
            tunjPasangan = 0.10 * gajiPokok;
        }

        if (kodeGolongan == 4) {
            tunjAnak = 0.05 * gajiPokok * jumlahAnak;
        }

        gajiBersih = gajiPokok + tunjPasangan + tunjAnak;

        System.out.println("\n=== Rincian Gaji Karyawan ===");
        System.out.println("NIK\t\t\t: " + NIK);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Kode Golongan\t\t: " + kodeGolongan);
        System.out.println("Gaji Pokok\t\t: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan\t: Rp" + tunjPasangan);
        System.out.println("Tunjangan Anak\t\t: Rp" + tunjAnak);
        System.out.println("--------------------------------------------");
        System.out.println("Gaji Bersih\t\t: Rp" + gajiBersih);
    }
}
