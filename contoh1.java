package abtraksi;

abstract class Kendaraan {
    String nama;
    
    public Kendaraan(String nama) {
        this.nama = nama;
    }

    abstract void bergerak();

    public void info() {
        System.out.println(nama + " adalah kendaraan.");
    }
}

class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan roda.");
    }
}

class Kapal extends Kendaraan {
    public Kapal(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak di air.");
    }
}

public class contoh1 {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan kapal = new Kapal("Kapal");
        
        mobil.info();
        mobil.bergerak();
        
        kapal.info();
        kapal.bergerak();
    }
}