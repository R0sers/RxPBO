
package RobiS_5520124028_PBOPrakP4;

import java.util.Scanner;

public class GanjilOrGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X;
        
        System.out.println("###Pengecekan Angka Genap / Ganjil###");
        System.out.print("Masukan Angka: ");
        X = input.nextDouble();
        input.nextLine();
        
        
            if(X%2 == 0){
                System.out.println(X + " Adalah Genap");
            }else{
                System.out.println(X + " Adalah Ganjil");
            }
    }
}
