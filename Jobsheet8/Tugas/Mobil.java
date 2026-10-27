package Jobsheet8.Tugas;

public class Mobil extends Transportasi {
    public String transmisi;

public Mobil(String transmisi, String bahanBakar, String warna, int jumlahPenumpang) {
        super(bahanBakar, warna, jumlahPenumpang);
        this.transmisi = transmisi;
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak dengan roda dan transmisi " + this.transmisi);
    }

    @Override
    public void isiBahanbakar() {
        System.out.println("Mengisi bahan bakar mobil dengan " + this.bahanBakar);
    }
    
}
