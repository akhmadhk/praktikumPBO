package Jobsheet4.TeoriPBO;
public class Pegawai {
    private String nip;
    private String nama;
    private String peran; // bisa "Kurir" atau "Admin"

    public Pegawai(String nip, String nama, String peran) {
        this.nip = nip;
        this.nama = nama;
        this.peran = peran;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    public String getInfo() {
        return "Pegawai[NIP=" + nip + ", Nama=" + nama + ", Peran=" + peran + "]";
    }
}
