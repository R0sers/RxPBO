package Robis_5520124028_PBOPrakP5;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka, max, min;

        System.out.print("Masukkan Angka ke-1: ");
        angka = input.nextInt();

        max = angka;
        min = angka;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan Angka ke-" + i + ": ");
            angka = input.nextInt();

            if (angka > max) {
                max = angka;
            }
            if (angka < min) {
                min = angka;
            }
        }

        System.out.println("\nBilangan Terbesar = " + max);
        System.out.println("Bilangan Terkecil = " + min);
    }
}
