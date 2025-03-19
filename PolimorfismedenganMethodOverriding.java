class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow! Meow!");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

public class PolimorfismedenganMethodOverriding {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.bersuara(); // Polimorfisme runtime
        hewan2.bersuara(); // Polimorfisme runtime
    }
}
