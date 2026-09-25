package Jobsheet4.TeoriPBO;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Pesanan> daftarPesanan;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.daftarPesanan = new ArrayList<>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String id) {
        this.idPelanggan = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPesanan(String idPesanan, LocalDate tanggal, Pegawai kurir) {
        Pesanan pesanan = new Pesanan(idPesanan, tanggal, kurir);
        daftarPesanan.add(pesanan);
    }

    public String getInfo() {
        return "Pelanggan[ID=" + idPelanggan + ", Nama=" + nama + "]";
    }

    public void tampilkanPesanan() {
        System.out.println("Pesanan milik " + nama + ":");
        for (Pesanan p : daftarPesanan) {
            System.out.println(" - " + p.getInfo());
        }
    }
}

