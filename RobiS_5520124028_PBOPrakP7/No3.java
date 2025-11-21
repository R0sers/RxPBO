
package RobiS_5520124028_PBOPrakP7;


class tebak{
    
    int guess(int bulan, int tanggal){
        return bulan*100 + tanggal;
    }

}

public class No3 {
    public static void main(String[] args) {
        tebak t = new tebak();
        int hasil = t.guess(1,14);
        System.out.println(hasil);
    }
}
