
package RobiS_5520124028_PBOPrakP9;

class Hewan {
    String nama;

    Hewan(String nama){
        this.nama = nama;
    }

    String makan(){
        return nama + " sedang makan.";
    }
}

class Kucing extends Hewan {
    Kucing(String nama){
        super(nama);
    }

    String display(){
        return "Nama hewan: " + nama;
    }
}

public class No4 {
    public static void main(String[] args){
        Kucing k = new Kucing("Oyen");
        System.out.println(k.display());
        System.out.println(k.makan());
    }
}

