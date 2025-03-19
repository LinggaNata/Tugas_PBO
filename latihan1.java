// Definisi Kelas
class Hewan {
    // Atribut
    String nama;
    String jenis;
    int umur;

    // Konstruktor
    Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun");
    }

    // Metode untuk menambah umur hewan
    void bertambahUmur(int tahun) {
        umur += tahun;
        System.out.println("Setelah bertambah umur:");
        tampilkanInfo();
    }

    // Metode untuk menampilkan suara khas hewan
    void suaraHewan() {
        if (jenis.equalsIgnoreCase("Mamalia")) {
            System.out.println(nama + ": Meong!"); // Contoh jika mamalia adalah kucing
        } else if (jenis.equalsIgnoreCase("Reptil")) {
            System.out.println(nama + ": Ssshh!");
        } else {
            System.out.println(nama + ": Suara tidak diketahui.");
        }
    }
}

// Program Utama
public class latihan1 {
    public static void main(String[] args) {
        // Membuat objek kucing
        Hewan kucing = new Hewan("Kucing", "Mamalia", 3);
        kucing.tampilkanInfo(); // Menampilkan info awal
        kucing.suaraHewan();    // Menampilkan suara kucing
        kucing.bertambahUmur(2); // Menambah umur kucing

        System.out.println(); // Pemisah antar objek

        // Membuat objek anjing
        Hewan anjing = new Hewan("Anjing", "Mamalia", 2);
        anjing.tampilkanInfo(); // Menampilkan info awal
        anjing.suaraHewan();    // Menampilkan suara anjing
        anjing.bertambahUmur(2); // Menambah umur anjing
    }
}
