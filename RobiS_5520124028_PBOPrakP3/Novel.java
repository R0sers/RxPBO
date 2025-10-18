package RobiS_5520124028_PBOPrakP3;

import java.util.Scanner;

public class Novel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lembar, hari, jam, menit, detik;
        int totalDetik;

        System.out.print("Masukkan jumlah lembar novel: ");
        lembar = input.nextInt();


        totalDetik = lembar;


        hari = totalDetik / 86400;            
        jam = (totalDetik % 86400) / 3600;    
        menit = (totalDetik % 3600) / 60;     
        detik = totalDetik % 60;

        System.out.println();
        System.out.println("Waktu yang dibutuhkan untuk mencetak " + lembar + " lembar adalah:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");

    }
}
