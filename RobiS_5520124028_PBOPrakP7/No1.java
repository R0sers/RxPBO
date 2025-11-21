
package RobiS_5520124028_PBOPrakP7;

class mobil {
    String merk;
    int tahun;
    
    void view(){
        System.out.println("Merk Mobil : " + merk);
        System.out.println("Tahun : " + tahun);
    }
}

public class No1 {
    public static void main(String[] args) {
        mobil m = new mobil();
        m.merk = "BMW M4";
        m.tahun = 2025;
        m.view();
    }
}
