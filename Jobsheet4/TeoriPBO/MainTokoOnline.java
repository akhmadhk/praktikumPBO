package Jobsheet4.TeoriPBO;
import java.time.LocalDate;

public class MainTokoOnline {
    public static void main(String[] args) {
        // Buat pegawai 1
        Pegawai pegawai1 = new Pegawai("E001", "Sari", "Admin");
        pegawai1.setNama("akhmad"); // Mengubah nama pegawai 1
        System.out.println(pegawai1.getNama());
        // Buat pelanggan
        Pelanggan pelanggan1 = new Pelanggan("P001", "Andi");

        // Pelanggan membuat pesanan (semua ditangani pegawai yang sama)
        pelanggan1.tambahPesanan("ORD001", LocalDate.now(), pegawai1);
        pelanggan1.tambahPesanan("ORD002", LocalDate.of(2026, 9, 20),pegawai1);

        // Tampilkan info
        System.out.println(pelanggan1.getInfo());
        pelanggan1.tampilkanPesanan();

        System.out.println(pegawai1.getInfo());
    }
}
