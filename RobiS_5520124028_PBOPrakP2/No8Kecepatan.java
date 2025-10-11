
package PrakP2;


public class No8Kecepatan {
    public static void main(String[] args) {
        double ToMoon = 384400; 
        double ToSun = 152100000; 
        double kecepatan = 300000; 

        double TMoon = ToMoon / kecepatan;
        double TSun = ToSun / kecepatan;

        System.out.println("Waktu tempuh ke Bulan = " + TMoon + " detik");
        System.out.println("Waktu tempuh ke Matahari = " + TSun + " detik");
    }
}

