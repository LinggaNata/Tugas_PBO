// Interface pertama
interface Hewan {
    void makan();
}

// Interface kedua
interface Mamalia {
    void menyusui();
}

// Kelas mengimplementasikan dua interface
class Kucing implements Hewan, Mamalia {
    @Override
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }

    @Override
    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }
}

// Main class
public class MultipleInheritancedenganInterface {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.makan();
        kucing.menyusui();
    }
}
