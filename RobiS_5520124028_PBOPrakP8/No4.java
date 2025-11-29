
package RobiS_5520124028_PBOPrakP8;

class Kasir {
    int hargaBarang;
    int jumlahBarang;
    double diskon;


    Kasir(int harga) {
        this.hargaBarang = harga;
        this.jumlahBarang = 1;
        this.diskon = 0;
    }


    Kasir(int harga, int jumlah) {
        this.hargaBarang = harga;
        this.jumlahBarang = jumlah;
        this.diskon = 0;
    }


    Kasir(int harga, int jumlah, double diskon) {
        this.hargaBarang = harga;
        this.jumlahBarang = jumlah;
        this.diskon = diskon;
    }

    double total() {
        double total = hargaBarang * jumlahBarang;
        return total - (total * diskon);
    }

    
}


public class No4 {
    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000);
        Kasir k2 = new Kasir(10000, 3);
        Kasir k3 = new Kasir(10000, 3, 0.1);

        System.out.println(k1.total());
        System.out.println(k2.total());
        System.out.println(k3.total());
    }
}
