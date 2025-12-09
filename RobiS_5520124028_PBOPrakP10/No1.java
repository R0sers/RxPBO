
package RobiS_5520124028_PBOPrakP10;

class Bentuk{
    double luas(){
        System.out.println(" Ini Luas Bentuk");
        return 0;
    }
}

class PersegiPanjang extends Bentuk{
    
    int p,l;
    int luas;
    
    @Override
    double  luas (){
        return luas = p*l;
    }
}
class BujurSangkar extends Bentuk{
    
    int sisi;
    int luas;
    
    @Override
    double luas (){
        return luas = sisi*sisi;
    }
}
class Segitiga extends Bentuk{
    
    int a,t;
    double luas;
    
    @Override
    double luas (){
        return luas = 0.5*a*t;
    }
}
class Lingkaran extends Bentuk{
    
    int r;
    double luas, pi=3.14;
    
    @Override
    double luas (){
        return luas = pi*(r*r);
    }
}

public class No1 {
    
}
