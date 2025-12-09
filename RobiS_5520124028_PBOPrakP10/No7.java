
package RobiS_5520124028_PBOPrakP10;

abstract class Kendaraan {
    protected String model;

    Kendaraan(String model){
        this.model = model;
    }

    abstract void informasi();
}

class Mobil extends Kendaraan {
    private String nama, jenis;

    Mobil(String model, String nama, String jenis){
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi(){
        System.out.println("MOBIL");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

class Pesawat extends Kendaraan {
    private String nama, jenis;

    Pesawat(String model, String nama, String jenis){
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi(){
        System.out.println("PESAWAT");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

class KapalLaut extends Kendaraan {
    private String nama, jenis;

    KapalLaut(String model, String nama, String jenis){
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi(){
        System.out.println("KAPAL LAUT");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

public class No7 {
    public static void main(String[] args){
        Kendaraan m = new Mobil("MPV-01", "Avanza", "MPV");
        Kendaraan p = new Pesawat("Boeing-777", "Garuda", "Jet");
        Kendaraan k = new KapalLaut("KM-Tidar", "Pelni", "Penumpang");

        m.informasi();
        p.informasi();
        k.informasi();
    }
}

