package Tugas;

public class KopiLatte extends Kopi {

    public String jenisSusu;

    // Constructor tanpa parameter
    public KopiLatte() {
        super();
        System.out.println("Constructor KopiLatte (tanpa parameter) dipanggil");
        this.jenisSusu = "Susu Sapi";
    }

    // Constructor berparameter
    public KopiLatte(String nama, double harga, String jenisSusu) {
        super(nama, harga); // memanggil constructor Kopi yang berparameter
        System.out.println("Constructor KopiLatte (berparameter) dipanggil");
        this.jenisSusu = jenisSusu;
    }

    // Overriding: nama dan parameter sama dengan getInfo() di Kopi
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis Susu: " + this.jenisSusu + "\n";
        return info;
    }
}
