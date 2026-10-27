package Jobsheet8;

public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("=== DATA LEBah ===");
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        System.out.println("\n=== DATA ULAR ===");
        Ular ular1 = new Ular(true, 12.5, "Tikus", "Savana");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}

