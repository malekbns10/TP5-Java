package techstore;

public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile(1, "Galaxy", "REF-M1", 1200, 6.5, "Snapdragon", 8,
                SystemeExploitation.Android, 48, 12, 2, 5000);
        OrdinateurDeBureau od = new OrdinateurDeBureau(2, "Tour PC", "REF-OD1", 2500, 24, "Intel i7", 16,
                SystemeExploitation.Windows, 1000, "RTX 3060", "650W");
        OrdinateurPortable op = new OrdinateurPortable(3, "ThinkBook", "REF-OP1", 3000, 15.6, "Ryzen 5", 16,
                SystemeExploitation.Ubuntu, 512, "Integrated", 6000);
        ComposantStockage cs = new ComposantStockage(4, "SSD", "REF-CS1", 150, 256);
        Peripheriques p = new Peripheriques(5, "Souris", "REF-P1", 40, "Bluetooth", "sans fil");

        System.out.println("Mobile : garantie " + m.garantirAppareil() + " an(s)");
        System.out.println("Bureau : garantie " + od.garantirAppareil() + " an(s)");
        System.out.println("Portable : garantie " + op.garantirAppareil() + " an(s)");
        System.out.println("Stockage : garantie " + cs.garantirAppareil() + " an(s)");
        System.out.println(p);
    }
}