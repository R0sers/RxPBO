package RobiS_5520124028_PBOPrakP4;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double X,Y;
         String Member;
         
         System.out.println("###Selamat Datang Di RoseMart###");
         System.out.print("Masukan Nominal Belanja: ");
         X = input.nextDouble();
         input.nextLine();
         System.out.print("Apakah Punya Member?? (Ya/Tidak) : ");
         Member = input.nextLine().toLowerCase();
         
         if (Member.equals("ya")){
             if(X>500000){
                 System.out.println("Total Belanja Lebih Dari Rp.500000");
                 System.out.println("Dan Punya Member, Anda Mendapat Diskon Rp.50000");
                 X = X - 50000;
                }  else if(X>100000 && X<=500000){
                 System.out.println("Total Belanja Lebih Dari Rp.100000");
                 System.out.println("Dan Punya Member, Anda Mendapat Diskon Rp.15000");
                 X = X - 15000; 
                }else{
                 System.out.println("Total Belanja Kurang Dari Rp.100000");
                 System.out.println("Tidak Mendapat Diskon");
                };
         } else{
             if(X>100000){
                 System.out.println("Total Belanja Lebih Dari Rp.100000");
                 System.out.println("Tapi Tidak Punya Member, Anda Mendapat Diskon Rp.10000");
                 X = X - 10000;
                }else{
                    System.out.println("Anda Tidak Mendapat Diskon Apapun");
                };
            };
         
         System.out.println("");
         System.out.println("Total Belanja Rp. "+ X);
         
         System.out.println("");
         System.out.print("Nominal Pembayaran: ");
         Y = input.nextDouble(); 
         input.nextLine();
         if (Y-X >=0){
             System.out.println("Kembalian Anda Rp. " + (Y-X));
             System.out.println("Terimakasih Sudah Berbelanja Di RoseMart");
         }else{
             System.out.println("Barang Disita, Tidak Boleh Kasbon!!");
         };
    }
    
}
