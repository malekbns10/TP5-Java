package heritage;

public class TestHeritage {
    public static void main(String[] args) {
        Adulte a1 = new Adulte("Amine", 35, "Ingénieur", "22132587");
        a1.afficherIdentite();

        Enfant e1 = new Enfant("Sami", 10, "École primaire", "55784311");
        Bebe b1 = new Bebe("Lina", 1, true, "98547621");

        System.out.println(a1);
        System.out.println(e1);
        System.out.println(b1);
        System.out.println("Nom de l'adulte : " + a1.getNom());

        // Test of the enum
        TypePersonne type = TypePersonne.ADULTE;
        System.out.println(type);

        for (TypePersonne t : TypePersonne.values()) {
            System.out.println(t);
        }
    }
}