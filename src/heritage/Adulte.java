package techstore;
public class Adulte extends Personne {
    private String profession;
    public Adulte(String nom, int age, String profession, String telephone) {
        super(nom, age ,telephone);
        this.profession = profession;
    }
    @Override
    public String toString() {
        return super.toString()
                + ", profession : " + profession;
    }
}