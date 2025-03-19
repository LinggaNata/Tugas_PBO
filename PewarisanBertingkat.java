// Superclass
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Subclass
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Subclass dari Kucing
class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing anggora.");
    }
}

// Main class
public class PewarisanBertingkat {
    public static void main(String[] args) {
        KucingAnggora anggora = new KucingAnggora();
        anggora.makan();  // Dari superclass Hewan
        anggora.suara();  // Dari subclass Kucing
        anggora.jenis();  // Dari subclass KucingAnggora
    }
}
