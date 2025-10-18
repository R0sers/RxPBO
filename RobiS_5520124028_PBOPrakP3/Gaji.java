
package RobiS_5520124028_PBOPrakP3;

import java.util.Scanner;

public class Gaji {

    public static void main(String[] args) {
        int NIK, gajpok, tunja, tunji, tunjak,total;
        String nama, alamat, jabatan;
        double pajak, gaji;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nomor Induk Karyawan\t: ");
        NIK = input.nextInt();
        input.nextLine();
        
        System.out.print("Nama Karyawan\t\t: ");
        nama = input.nextLine();
        
        System.out.print("Alamat\t\t\t: ");
        alamat = input.nextLine();
        
        System.out.print("Jabatan\t\t\t: ");
        jabatan = input.nextLine();
        
        System.out.print("Gaji Pokok\t\t: ");
        gajpok = input.nextInt();
        
        System.out.print("Tunjangan Jabatan\t: ");
        tunja = input.nextInt();
        
        System.out.print("Tunjangan Istri\t\t: ");
        tunji = input.nextInt();
        
        System.out.print("Tunjangan Anak\t\t: ");
        tunjak = input.nextInt();
        
        total = gajpok+tunja+tunji+tunjak;
        System.out.print("Total Gaji\t\t: " + total);
        System.out.println("");

        pajak=0.1*(gajpok+tunja+tunjak);
        System.out.print("Pajak Penghasilan \t: " + pajak);
        System.out.println("");
        
        gaji = total-pajak;
        System.out.print("Gaji Bersih\t\t: " + gaji);
        System.out.println("");
    }
}
