
package RobiS_5520124028_PBOPrakP9;

class Produk {
    String judul, penulis;

    Produk(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    String getInfoProduk(){
        return "Judul: " + judul + ", Penulis: " + penulis;
    }
}

class Komik extends Produk {
    Komik(String judul, String penulis){
        super(judul, penulis);
    }
}

class Games extends Produk {
    Games(String judul, String penulis){
        super(judul, penulis);
    }
}

public class No5 {
    public static void main(String[] args){
        Komik k = new Komik("Naruto", "Masashi Kishimoto");
        Games g = new Games("GTA V", "Rockstar");

        System.out.println(k.getInfoProduk());
        System.out.println(g.getInfoProduk());
    }
}

