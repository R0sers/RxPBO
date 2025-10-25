
package RobiS_5520124028_PBOPrakP4;

import java.util.Scanner;

public class Kabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X;
        System.out.println("###Menentukan Tahun Kabisat###");
        System.out.print("Masukkan Tahun: ");
        X = input.nextInt();


        if ((X % 400 == 0) || (X % 4 == 0 && X % 100 != 0)) {
            System.out.println(X + " Adalah Tahun kabisat.");
        } else {
            System.out.println(X + " Bukan Tahun kabisat.");
        }
        
        
    }
}
