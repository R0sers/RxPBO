
package RobiS_5520124028_PBOPrakP8;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        String total = "";
        
        System.out.println("##Menentukan Nilai Biner##");
        System.out.print("Masukan Angka : ");
        x = input.nextInt();
        
        while(x>0){
            total = (x%2) + total;
            x /=2;
        }
        
        System.out.println("Biner dari " + x +" = " + total);
    }
}