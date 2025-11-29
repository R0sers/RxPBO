
package RobiS_5520124028_PBOPrakP8;

class Deret {
    void tampilkan(int[] data) {
        for (int x : data) {
            System.out.print(x + " ");
        }
    }
}

public class No7 {
        public static void main(String[] args) {
        int[] deret = {6, 12, 24, 48, 96};

        Deret d = new Deret();
        d.tampilkan(deret); 
    }
}

