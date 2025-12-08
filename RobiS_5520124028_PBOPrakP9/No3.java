
package RobiS_5520124028_PBOPrakP9;


class Kubus {
    private double sisi;

    public Kubus(double sisi){
        this.sisi = sisi;
    }

    public double hitungVolume(){
        return sisi * sisi * sisi;
    }
}


public class No3 {
    public static void main(String[] args){
        Kubus k = new Kubus(4);
        System.out.println("Volume kubus = " + k.hitungVolume());
    }
}
