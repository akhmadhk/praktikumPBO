package Jobsheet4.TeoriPBO;
import java.time.LocalDate;

public class MainTokoOnline {
    public static void main(String[] args) {
        // Buat satu pegawai saja
        Pegawai pegawai1 = new Pegawai("E001", "Sari", "Admin & Kurir");

        // Buat pelanggan
        Pelanggan pelanggan1 = new Pelanggan("P001", "Andi");

        // Pelanggan membuat pesanan (semua ditangani pegawai yang sama)
        pelanggan1.tambahPesanan("ORD001", LocalDate.now(), pegawai1);
        pelanggan1.tambahPesanan("ORD002", LocalDate.of(2025, 9, 20), pegawai1);

        // Tampilkan info
        System.out.println(pelanggan1.getInfo());
        pelanggan1.tampilkanPesanan();

        System.out.println(pegawai1.getInfo());
    }
}
