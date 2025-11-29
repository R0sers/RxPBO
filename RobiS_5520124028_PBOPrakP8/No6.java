
package RobiS_5520124028_PBOPrakP8;

class DataNilai {
    int[] nilai;

    DataNilai(int[] n) {
        this.nilai = n;
    }

    double rataRata() {
        int total = 0;
        for (int x : nilai) total += x;
        return (double) total / nilai.length;
    } 
}

public class No6 {
        public static void main(String[] args) {
        int[] arr = {80, 90, 75, 85};
        DataNilai d = new DataNilai(arr);
        System.out.println("Rata-rata = " + d.rataRata());
    }
}

