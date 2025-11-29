
package RobiS_5520124028_PBOPrakP8;

import java.util.Scanner;


public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, total=1;
        
        System.out.println("##Menentukan Nilai Faktorial##");
        System.out.print("Masukan Angka : ");
        x = input.nextInt();
        
        for (int i = 1 ; i<=x ; i++){
            total *= i;
        }
        
        System.out.println("Nilai dari " + x +"! = " + total);
    }
}
