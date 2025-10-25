
package RobiS_5520124028_PBOPrakP4;

import java.util.Scanner;

public class Salesman {
        public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        double X,Y;
        System.out.println("###Komisi Salesman###");
        System.out.print("Masukkan Pendapatan: ");
        X = input.nextDouble();
        input.nextLine();
        
        if(X==2000000){
            System.out.println("Mendapat Tambahan Uang Jasa Rp.100000");
            Y = 0.1 * X;
            X = X + 100000 + Y;
            System.out.println("Mendapat Komisi Rp. " + Y);
            System.out.println("Total Pendapatan Rp. " + X);
        }else if (X>= 2000000 || X<=5000000){
            System.out.println("Mendapat Tambahan Uang Jasa Rp.200000");
            Y = 0.15 * X;
            X = X + 200000 + Y;
            System.out.println("Mendapat Komisi Rp. " + Y);
            System.out.println("Total Pendapatan Rp. " + X);
        }else if (X>5000000){
            System.out.println("Mendapat Tambahan Uang Jasa Rp.300000");
            Y = 0.2 * X;
            X = X + 300000 + Y;
            System.out.println("Mendapat Komisi Rp. " + Y);
            System.out.println("Total Pendapatan Rp. " + X);
        }else{
            System.out.println("Tidak Mendapat Tambahan Uang Jasa");
            System.out.println("Tidak Mendapat Komisi");
            System.out.println("Total Pendapatan Rp. " + X);
        }
        
        
    }
}
