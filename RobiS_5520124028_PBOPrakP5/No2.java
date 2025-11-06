
package Robis_5520124028_PBOPrakP5;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n,bil,rata;

        System.out.print("Masukkan jumlah bilangan: ");
        n = input.nextInt();

        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bil = input.nextDouble();
            total += bil;
        }

       rata = total / n;
        System.out.println("\nTotal jumlah bilangan = " + total);
        System.out.println("Rata-rata = " + rata);
    }
}
