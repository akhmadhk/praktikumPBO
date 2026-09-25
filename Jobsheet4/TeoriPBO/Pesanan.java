package Jobsheet4.TeoriPBO;

import java.time.LocalDate;

public class Pesanan {
    private String idPesanan;
    private LocalDate tanggal;
    private Pegawai kurir;

    public Pesanan(String idPesanan, LocalDate tanggal, Pegawai kurir) {
        this.idPesanan = idPesanan;
        this.tanggal = tanggal;
        this.kurir = kurir;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai getKurir() {
        return kurir;
    }

    public void setKurir(Pegawai kurir) {
        this.kurir = kurir;
    }

    public String getInfo() {
        return "Pesanan[ID=" + idPesanan + ", Tanggal=" + tanggal +
                ", Kurir=" + kurir.getNama() + "]";
    }
}

