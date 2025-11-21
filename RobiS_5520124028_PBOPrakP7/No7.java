
package RobiS_5520124028_PBOPrakP7;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String npm;
    String kelas;

    Mahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;  
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampil() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NPM  : " + this.npm);
        System.out.println("Kelas: " + this.kelas);
    }
}

public class No7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String n = input.nextLine();

        System.out.print("NPM : ");
        String p = input.nextLine();

        System.out.print("Kelas : ");
        String k = input.nextLine();

        Mahasiswa m = new Mahasiswa(n, p, k);
        m.tampil();
    }
}
