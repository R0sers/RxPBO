
package RobiS_5520124028_PBOPrakP6;
import java.util.Scanner;

public class No3 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] data = new int[n];


        System.out.println("Masukkan nilainya:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            data[i] = sc.nextInt();
        }

        int max = data[0];
        int min = data[0];
        int idxMax = 0;
        int idxMin = 0;

        for (int i = 1; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
                idxMax = i;
            }
            if (data[i] < min) {
                min = data[i];
                idxMin = i;
            }
        }

        System.out.println("\nNilai terbesar : " + max + " (indeks " + idxMax + ")");
        System.out.println("Nilai terkecil : " + min + " (indeks " + idxMin + ")");

        int total = 0;
        for (int x : data) total += x;

        double rata = (double) total / n;

        System.out.println("\nJumlah seluruh elemen: " + total);
        System.out.println("Rata-rata: " + rata);


        int sumGanjil = 0;
        for (int i = 1; i < n; i += 2) sumGanjil += data[i];

        System.out.println("\nJumlah elemen indeks ganjil: " + sumGanjil);




        if (total % 2 == 0)
            System.out.println("\nTotal adalah GENAP");
        else
            System.out.println("\nTotal adalah GANJIL");


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nArray setelah diurutkan:");
        for (int x : data) System.out.print(x + " ");
    }
}


