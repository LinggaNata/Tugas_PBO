// Interface
interface Hewan {
    void bersuara(); // Method abstrak
}

// Implementasi pada kelas Kucing
class Kucing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Kucing mengeong: Meow Meow!");
    }
}

// Implementasi pada kelas Anjing
class Anjing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Anjing menggonggong: Woof Woof!");
    }
}

// Main class untuk menjalankan program
public class contoh2 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing(); // Polimorfisme dengan interface
        Hewan anjing = new Anjing(); // Polimorfisme dengan interface
        
        // Memanggil metode bersuara()
        kucing.bersuara();
        anjing.bersuara();
    }
}
