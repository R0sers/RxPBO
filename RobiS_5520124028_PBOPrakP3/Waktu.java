package RobiS_5520124028_PBOPrakP3;

import java.util.Scanner;

public class Waktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jam1, menit1, detik1;
        int jam2, menit2, detik2;
        int totalDetik1, totalDetik2, selisihDetik;
        int sisaJam, sisaMenit, sisaDetik;
        
        
        System.out.print("Masukkan Jam pertama   : ");
        jam1 = input.nextInt();
        System.out.print("Masukkan Menit pertama : ");
        menit1 = input.nextInt();
        System.out.print("Masukkan Detik pertama : ");
        detik1 = input.nextInt();
        
        System.out.println();
        
        System.out.print("Masukkan Jam kedua     : ");
        jam2 = input.nextInt();
        System.out.print("Masukkan Menit kedua   : ");
        menit2 = input.nextInt();
        System.out.print("Masukkan Detik kedua   : ");
        detik2 = input.nextInt();

        totalDetik1 = jam1 * 3600 + menit1 * 60 + detik1;
        totalDetik2 = jam2 * 3600 + menit2 * 60 + detik2;

        selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        sisaJam = selisihDetik / 3600;
        sisaMenit = (selisihDetik % 3600) / 60;
        sisaDetik = selisihDetik % 60;
        
        System.out.println();
        System.out.println("Selisih Waktu: " + sisaJam + " jam, " + sisaMenit + " menit, " + sisaDetik + " detik.");
    }
}
