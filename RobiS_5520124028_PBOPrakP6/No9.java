
package RobiS_5520124028_PBOPrakP6;

public class No9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Pakai For");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i]+" ");
        }
        
        System.out.println("");
        System.out.println("Pakai Foeach");
        
        for (int a : age) {
            System.out.print(a+" ");
        }
        
        System.out.println("");
        System.out.println("Pakai While: ");
        int i = 0;
        while (i < age.length) {
            System.out.print(age[i]+" ");
            i++;
        }

    }
}
