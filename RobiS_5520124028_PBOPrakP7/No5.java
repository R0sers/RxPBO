
package RobiS_5520124028_PBOPrakP7;

class Rekursif {
    void cetak(int n) {
        if(n == 0) return;
        System.out.println(n);
        cetak(n - 1);
    }
}


public class No5 {
     public static void main(String[] args) {
        Rekursif r = new Rekursif();
        r.cetak(5);
    }
}
