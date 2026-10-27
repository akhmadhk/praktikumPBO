package Jobsheet8.Tugas;
public abstract class Transportasi {
    public String bahanBakar;
    public String warna;
    public int jumlahPenumpang;
    
    public Transportasi(String bahanBakar, String warna, int jumlahPenumpang) {
        this.bahanBakar = bahanBakar;
        this.warna = warna;
        this.jumlahPenumpang = jumlahPenumpang;
    }
    public abstract void bergerak();
    public abstract void isiBahanbakar();
    
    public void cetakInfo() {
        System.out.println("Bahan Bakar : " + this.bahanBakar);
        System.out.println("Warna : " + this.warna);
        System.out.println("Jumlah Penumpang : " + this.jumlahPenumpang);
    }
}
