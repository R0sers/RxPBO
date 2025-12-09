
package RobiS_5520124028_PBOPrakP10;

interface InfoUniversitas {
    void tampilData();
}

class Universitas implements InfoUniversitas {
    String nama, alamat, telepon, provinsi, negara;

    Universitas(){
        nama = "Universitas Suryakancana";
        alamat = "Pasir Gede";
        telepon = "08123-3210-3123";
        provinsi = "Jawa Barat";
        negara = "Indonesia";
    }

    @Override
    public void tampilData(){
        System.out.println("Data Universitas Cianjur");
        System.out.println("Nama Universitas : " + nama);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Telepon          : " + telepon);
        System.out.println("Provinsi         : " + provinsi);
        System.out.println("Negara           : " + negara);
    }
}


public class No2 {
    public static void main(String[] args){
        Universitas u = new Universitas();
        u.tampilData();
    }
}
