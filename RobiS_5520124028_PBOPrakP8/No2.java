
package RobiS_5520124028_PBOPrakP8;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y, total=1;
        
        System.out.println("##Menentukan Nilai Pangkat##");
        System.out.print("Masukan Nilai Basis : ");
        x = input.nextInt();
        System.out.print("Masukan Nilai Pangkat : ");
        y = input.nextInt();
        
        for (int i = 1 ; i<=y ; i++){
            total *= x;
        }
        
        System.out.println(x +" Pangkat " + y +" = " + total);
    }
}
