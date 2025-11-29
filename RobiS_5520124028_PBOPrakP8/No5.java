
package RobiS_5520124028_PBOPrakP8;

class Persegi {
    int panjang, lebar;

    Persegi(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }

    int luas() {
        return panjang * lebar;
    }
}

class Hitam {
    int hitungLuas(Persegi besar, Persegi kecil) {
        return besar.luas() - kecil.luas();
    }
}

public class No5 {
    public static void main(String[] args) {
        Persegi besar = new Persegi(10, 5);
        Persegi kecil = new Persegi(8, 4);

        Hitam h = new Hitam();
        System.out.println("Luas hitam = " + h.hitungLuas(besar, kecil));
    }
}

