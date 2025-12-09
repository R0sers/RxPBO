package RobiS_5520124028_PBOPrakP10;

abstract class Produk {
    protected String judul, penulis;

    Produk(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }


    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    abstract String getInfoProduk();
}

class Komik extends Produk {
    private int jumlahHalaman;

    Komik(String judul, String penulis, int jumlahHalaman){
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    String getInfoProduk(){
        return "Judul: " + judul +
               ", Penulis: " + penulis +
               ", Halaman: " + jumlahHalaman;
    }
}

class Games extends Produk {
    private int waktuMain;

    Games(String judul, String penulis, int waktuMain){
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    String getInfoProduk(){
        return "Judul: " + judul +
               ", Penulis: " + penulis +
               ", Waktu main: " + waktuMain + " jam";
    }
}

public class No5 {
    public static void main(String[] args){
        Komik k = new Komik("One Piece", "Oda", 900);
        Games g = new Games("Valorant", "Riot Games", 1200);

        // Contoh penggunaan setter
        k.setJudul("One Piece Vol. 2");
        g.setPenulis("Riot Dev Team");

        System.out.println(k.getInfoProduk());
        System.out.println(g.getInfoProduk());
    }
}
