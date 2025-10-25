
package RobiS_5520124028_PBOPrakP4;

import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int X;
        float S,x,y;
        
        
        System.out.println("==Menghitung Luas Bangun Datar==");
        System.out.println("1.Persegi");
        System.out.println("2.Segitiga");
        System.out.println("3.Lingkaran");
        System.out.println("4.Trapesium");
        System.out.println("5.Layang-Layang");
        System.out.print("Pilih Luas Bangun Datar: ");
        X = input.nextInt();
        input.nextLine();
        
        
        switch(X){
            case 1:
                System.out.println("");
                System.out.println("Luas Persegi");
                System.out.println("Sisi x Sisi");
                System.out.print("Masukan Sisi: ");
                S = input.nextFloat();
                System.out.println("Luas Persegi Dengan Sisi = " + S + " Adalah : " + S*S);
                break;
            case 2:
                System.out.println("");
                System.out.println("Luas Segitiga");
                System.out.println("1/2 x Alas x Tinggi");
                System.out.print("Masukan Alas: ");
                x = input.nextFloat();
                System.out.print("Masukan Tinggi: ");
                y = input.nextFloat();
                System.out.println("Luas Persegi Dengan Alas = " + x + " Dan Tinggi = " + y +  " Adalah : " +(0.5*x*y));
                break;
            case 3:
                System.out.println("");
                System.out.println("Luas Lingkaran");
                System.out.println("Pi x Jari-Jari x Jari-Jari");
                System.out.print("Masukan Jari-Jari: ");
                S = input.nextFloat();
                System.out.println("Luas Persegi Dengan Jari-Jari = " + S + " Adalah : " + 3.14*S*S);
                break;
            case 4:
                System.out.println("");
                System.out.println("Luas Trapesium");
                System.out.println("1/2 x (Sisi Sejajar 1 + Sisi Sejajar 2) x Tinggi");
                System.out.print("Masukan Sisi Sejajar 1: ");
                x = input.nextFloat();
                System.out.print("Masukan Sisi Sejajar 2: ");
                y = input.nextFloat();
                System.out.print("Masukan Tinggi: ");
                S = input.nextFloat();
                System.out.println("Luas Trapesium Dengan Sisi Sejajar 1 = " + x + " ,Sisi Sejajar 2 = " + y + " Dan Tinggi = " + S + " Adalah : " + (0.5*(x+y)*S) );
                break;
            case 5:
                System.out.println("");
                System.out.println("Luas Layang-Layang");
                System.out.println("1/2 x Diagonal 1 x Diagonal 2");
                System.out.print("Masukan Diagonal 1: ");
                x = input.nextFloat();
                System.out.print("Masukan Diagonal 2: ");
                y = input.nextFloat();
                System.out.println("Luas Layang-Layang Dengan Diagonal 1 = " + x + " Dan Diagonal 2 = " + y + " Adalah : "+(0.5*x*y));
                break;

            default:
                System.out.println("ULANGI!! Pilih Antara 1-5");
                break;
        }
    }
}
