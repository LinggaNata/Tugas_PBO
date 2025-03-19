// Superclass
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Subclass 1
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Subclass 2
class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Main class
public class PewarisanHirarki {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();

        kucing.makan(); // Dari superclass
        kucing.suara(); // Dari subclass Kucing

        anjing.makan(); // Dari superclass
        anjing.suara(); // Dari subclass Anjing
    }
}
