package Tugas;

public class Kopi {

    public String nama;
    public double harga;

    // Constructor tanpa parameter
    public Kopi() {
        System.out.println("Constructor Kopi (tanpa parameter) dipanggil");
        this.nama = "Kopi Biasa";
        this.harga = 0;
    }

    // Constructor berparameter
    public Kopi(String nama, double harga) {
        System.out.println("Constructor Kopi (berparameter) dipanggil");
        this.nama = nama;
        this.harga = harga;
    }

    // Method yang nanti di-override oleh subclass
    public String getInfo() {
        String info = "";
        info += "Nama Kopi : " + this.nama + "\n";
        info += "Harga     : Rp" + this.harga + "\n";
        return info;
    }
}
