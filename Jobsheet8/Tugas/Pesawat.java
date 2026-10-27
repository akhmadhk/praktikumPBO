package Jobsheet8.Tugas;

public class Pesawat extends Transportasi {
    public int jumlahMesin;

    public Pesawat(int jumlahMesin, String bahanBakar, String warna, int jumlahPenumpang) {
        super(bahanBakar, warna, jumlahPenumpang);
        this.jumlahMesin = jumlahMesin;
    }

    @Override
    public void bergerak() {
        System.out.println("Pesawat bergerak dengan sayap dan " + this.jumlahMesin + " mesin");
    }

    @Override
    public void isiBahanbakar() {
        System.out.println("Mengisi bahan bakar pesawat dengan " + this.bahanBakar);
    }
    
}
