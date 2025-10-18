
package RobiS_5520124028_PBOPrakP3;

import java.util.Scanner;

public class Sentripetal {
    public static void main(String[] args) {
        double f,m,v,r;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Massa\t\t: ");
        m = input.nextDouble();
        System.out.print("Masukan Kecepatan Linear: ");
        v = input.nextDouble();
        System.out.print("Masukan Jari-Jari\t: ");
        r = input.nextDouble();
        System.out.println("");
        
        f=(m*(v*v))/r;
        System.out.println("Massa\t\t= " + m);
        System.out.println("Kecepatan Linear= "+ v);
        System.out.println("Jari-Jari\t= " + r);
        System.out.println("Gaya Sentripetal= " +f + " N");
    }
}
