package Tugas;

public class KopiEspresso extends Kopi {

    public int jumlahShot;

    // Constructor tanpa parameter
    public KopiEspresso() {
        super();
        System.out.println("Constructor KopiEspresso (tanpa parameter) dipanggil");
        this.jumlahShot = 1;
    }

    // Constructor berparameter
    public KopiEspresso(String nama, double harga, int jumlahShot) {
        super(nama, harga); // memanggil constructor Kopi yang berparameter
        System.out.println("Constructor KopiEspresso (berparameter) dipanggil");
        this.jumlahShot = jumlahShot;
    }

    // Overriding: nama dan parameter sama dengan getInfo() di Kopi
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jumlah Shot: " + this.jumlahShot + "\n";
        return info;
    }
}
