class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}

public class PolimorfismedenganMethodOverloading {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println(k.tambah(5, 10));
        System.out.println(k.tambah(5, 10, 15));
        System.out.println(k.tambah(5.5, 2.5));
    }
}
