package RobiS_5520124028_PBOPrakP3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        
      String nama;
      int bayar, belanja;
      double  kembalian, diskon, total;
      
      
        System.out.print("Masukan Nama\t: ");
        nama = input.readLine();
        
        System.out.print("Total Belanja\t: ");
        belanja = Integer.parseInt(input.readLine());
        
        System.out.print("Diskon\t\t: ");
        diskon = Double.parseDouble(input.readLine());
        
        total = belanja-(diskon * belanja);
        System.out.println("Total\t\t: " + total);
        
        System.out.print("Bayar\t\t: ");
        bayar = Integer.parseInt(input.readLine());
        
        kembalian = bayar-total;
        System.out.println("Kembalian\t:" + kembalian);
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Pembelanjaan.txt"));
        dos.writeUTF(nama);
        dos.writeInt(belanja);
        dos.writeDouble(diskon);
        dos.writeDouble(total);
        dos.writeInt(bayar);
        dos.writeDouble(kembalian);
        dos.close();
        
        DataInputStream dis = new DataInputStream(new FileInputStream("Pembelanjaan.txt"));
        nama = dis.readUTF();
        belanja = dis.readInt();
        diskon = dis.readDouble();
        total = dis.readDouble();
        bayar = dis.readInt();
        kembalian = dis.readDouble();
        dis.close();
        
        
        
    }
    
}
