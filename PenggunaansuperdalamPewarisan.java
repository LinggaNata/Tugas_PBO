class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void info() {
        System.out.println("Nama: " + nama);
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama); // Memanggil konstruktor superclass
    }
}

public class PenggunaansuperdalamPewarisan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Tom");
        kucing.info();
    }
}
