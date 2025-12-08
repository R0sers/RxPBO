package RobiS_5520124028_PBOPrakP9;

class HewanBerkaki {
    String jenis;
    String contoh;

    HewanBerkaki(String jenis, String contoh){
        this.jenis = jenis;
        this.contoh = contoh;
    }

    void display(){
        System.out.println("- hewan berkaki " + jenis + ": " + contoh);
    }
}

class DuaKaki extends HewanBerkaki {
    DuaKaki() { super("dua", "kanguru, ayam, bebek, dll"); }
}

class EnamKaki extends HewanBerkaki {
    EnamKaki() { super("enam", "capung, nyamuk, kupu-kupu, dll"); }
}

class EmpatKaki extends HewanBerkaki {
    EmpatKaki() { super("empat", "kucing, anjing, kuda, dll"); }
}

class DelapanKaki extends HewanBerkaki {
    DelapanKaki() { super("delapan", "kepiting, belalang, laba-laba, dll"); }
}

public class No1 {
    public static void main(String[] args) {
        System.out.println("Macam-macam hewan:");
        new DuaKaki().display();
        new EnamKaki().display();
        new EmpatKaki().display();
        new DelapanKaki().display();
    }
}
