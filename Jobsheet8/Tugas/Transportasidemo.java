package Jobsheet8.Tugas;
public class Transportasidemo {
    public static void main(String[] args) {
        Pesawat pesawat = new Pesawat(2, "Avtur", "Putih", 150);
        Mobil mobil = new Mobil("Manual", "Pertamax", "Hitam", 5);

        System.out.println("Informasi Pesawat:");
        pesawat.cetakInfo();
        pesawat.bergerak();
        pesawat.isiBahanbakar();

        System.out.println("\nInformasi Mobil:");
        mobil.cetakInfo();
        mobil.bergerak();
        mobil.isiBahanbakar();
    }
    
}
