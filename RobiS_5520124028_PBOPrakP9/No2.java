
package RobiS_5520124028_PBOPrakP9;

class Segitiga {
    protected double alas, tinggi;

    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
}

public class No2 {
    public static void main(String[] args){
        Segitiga s = new Segitiga(10, 5);
        System.out.println("Luas segitiga = " + s.hitungLuas());
    }
}
