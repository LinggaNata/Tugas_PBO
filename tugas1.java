class Kendaraan {
    // Atribut
    String merk;
    String tipe;
    int kecepatan;
    
    // Konstruktor
    Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }
    
    // Metode untuk menampilkan informasi kendaraan
    void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }
    
    // Metode untuk menambah kecepatan kendaraan
    void tambahKecepatan(int km) {
        this.kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }
    
    // Metode untuk mengurangi kecepatan kendaraan
    void kurangiKecepatan(int km) {
        if (this.kecepatan - km < 0) {
            this.kecepatan = 0;
        } else {
            this.kecepatan -= km;
        }
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }
    
    // Metode untuk menghentikan kendaraan
    void berhenti() {
        this.kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }
}

public class tugas1 {
    public static void main(String[] args) {
        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("Toyota", "Mobil", 60);
        Kendaraan kendaraan2 = new Kendaraan("Yamaha", "Motor", 40);
        
        // Menampilkan informasi dan operasi pada kendaraan1
        kendaraan1.tampilkanInfo();
        kendaraan1.tambahKecepatan(20);
        kendaraan1.kurangiKecepatan(30);
        kendaraan1.berhenti();
        kendaraan1.tampilkanInfo();
        
        System.out.println(); // Pemisah output
        
        // Menampilkan informasi dan operasi pada kendaraan2
        kendaraan2.tampilkanInfo();
        kendaraan2.tambahKecepatan(30);
        kendaraan2.kurangiKecepatan(40);
        kendaraan2.berhenti();
        kendaraan2.tampilkanInfo();
    }
}