package Tugas;

public class KopiDemo {
    public static void main(String[] args) {
        KopiLatte latte = new KopiLatte("Kopi Latte", 25000, "Susu Oat");
        System.out.println(latte.getInfo());

        KopiEspresso espresso = new KopiEspresso("Kopi Espresso", 20000, 2);
        System.out.println(espresso.getInfo());
    }
}
