
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
    int jumlahHalaman;

    Komik(String judul, String penulis, int jumlahHalaman){
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    String getInfoProduk(){
        return super.getInfoProduk() + ", Halaman: " + jumlahHalaman;
    }
}

class Games extends Produk {
    int waktuMain;

    Games(String judul, String penulis, int waktuMain){
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    String getInfoProduk(){
        return super.getInfoProduk() + ", Waktu main: " + waktuMain + " jam";
    }
}

public class No6 {
    public static void main(String[] args){
        Komik k = new Komik("One Piece", "Oda", 900);
        Games g = new Games("Valorant", "Riot Games", 1200);

        System.out.println(k.getInfoProduk());
        System.out.println(g.getInfoProduk());
    }
}

