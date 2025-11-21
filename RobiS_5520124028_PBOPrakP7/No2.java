
package RobiS_5520124028_PBOPrakP7;

class persegiPanjang{
    double p,l,kel;
    
    double kelPP(){
        kel = 2*(p+l);
        return kel;
    }   
    
    void view(){
        System.out.println("Keliling Persegi Panjang dengan Panjang " + p + " dan lebar "+ l +" = " + kelPP());
    }
}


public class No2 {
    public static void main(String[] args) {
        persegiPanjang pp1 = new persegiPanjang();
        pp1.p = 5;
        pp1.l = 5;
        pp1.kelPP();
        pp1.view();
    }
    
}
