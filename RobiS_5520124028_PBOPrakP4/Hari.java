
package RobiS_5520124028_PBOPrakP4;

import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X;
        
        System.out.println("==Kode Hari==");
        System.out.println("1.Senin");
        System.out.println("2.Selasa");
        System.out.println("3.Rabu");
        System.out.println("4.Kamis");
        System.out.println("5.Jum'at");
        System.out.println("6.Sabtu");
        System.out.println("7.Minggu");
        System.out.print("Masukan Kode Hari: ");
        X = input.nextInt();
        input.nextLine();
        
        
        switch(X){
            case 1:
                System.out.println("Kode yang dipilih adalah Hari Senin");
                break;
            case 2:
                System.out.println("Kode yang dipilih adalah Hari Selasa");
                break;
            case 3:
                System.out.println("Kode yang dipilih adalah Hari Rabu");
                break;
            case 4:
                System.out.println("Kode yang dipilih adalah Hari Kamis");
                break;
            case 5:
                System.out.println("Kode yang dipilih adalah Hari Jum'at");
                break;
            case 6:
                System.out.println("Kode yang dipilih adalah Hari Sabtu");
                break;
            case 7:
                System.out.println("Kode yang dipilih adalah Hari Minggu");
                break;
            
            default:
                System.out.println("ULANGI!! Pilih Angka Antara 1-7");
                break;
        }   
    }
}
