
package RobiS_5520124028_PBOPrakP7;

class Civitas {
    String nama;
    String status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void info() {
        System.out.println(nama + " - " + status);
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen");
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff");
    }
}

public class No6 {
    public static void main(String[] args) {
        new Dosen("Budi").info();
        new Mahasiswa("Sinta").info();
        new Staff("Rani").info();
    }
}
