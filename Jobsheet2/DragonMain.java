package Jobsheet2;

public class DragonMain {
    public static void main(String[] args) {
        // Instansiasi 2 objek Dragon
        Dragon dragon1 = new Dragon();
        dragon1.changeDirection(2); // Mengubah arah dragon1 ke Kanan
        dragon1.move(5); // Menggerakkan dragon1 sejauh 5 langkah
        dragon1.printPosition(); // Menampilkan posisi dragon1

        Dragon dragon2 = new Dragon(); // Instansiasi dragon2 dengan posisi (3, 4) dan arah Atas
        dragon2.move(2); // Menggerakkan dragon2 sejauh 2 langkah
        dragon2.printPosition(); // Menampilkan posisi dragon2
    }
}