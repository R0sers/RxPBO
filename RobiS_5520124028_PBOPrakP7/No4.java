
package RobiS_5520124028_PBOPrakP7;


class SumpahPemuda {
    String kalimat1;

    SumpahPemuda() {
        kalimat1 = "Kami putra dan putri Indonesia";
    }
    
    void lanjut() {
        System.out.println("Mengaku bertumpah darah yang satu, tanah Indonesia.");
        System.out.println("Mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println("Menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}
public class No4 {
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        System.out.println(sp.kalimat1);
        sp.lanjut();
    }
}
