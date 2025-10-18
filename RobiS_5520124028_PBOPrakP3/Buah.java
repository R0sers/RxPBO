package RobiS_5520124028_PBOPrakP3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        
      int mangga,jambu,beri,buang,total,orang;
      
        
        System.out.print("Beli Mangga: ");
        mangga = Integer.parseInt(input.readLine());
        
        System.out.print("Total Orang diberi Jambu: ");
        orang = Integer.parseInt(input.readLine());
        
        System.out.print("Jambu diberikan: ");
        beri = Integer.parseInt(input.readLine());
        
        jambu = beri * orang;
        System.out.println("Beli Jambu: " + jambu);

        System.out.print("Mangga Dibuang: ");
        buang = Integer.parseInt(input.readLine());
        mangga = mangga - buang;
        
        System.out.println("Mangga = " + mangga);
        System.out.println("Jambu = " +jambu);
        total = mangga + jambu;
        System.out.println("Total Buah = " +total);
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Buah.txt"));
        dos.writeInt(mangga);
        dos.writeInt(jambu);
        dos.writeInt(total);

        dos.close();
        
        DataInputStream dis = new DataInputStream(new FileInputStream("Buah.txt"));
        mangga = dis.readInt();
        jambu = dis.readInt();
        total = dis.readInt();
        
        dis.close();
        
        
        
    }
    
}
