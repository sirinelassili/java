// Classe parente pour les animaux terrestres
public class Terrestrial {
    private int nbrLegs;  // Attribut protégé

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial() {
        this.nbrLegs = 4;
    }

    // Getter pour nbrLegs
    public int getNbrLegs() {
        return nbrLegs;
    }

    // Setter pour nbrLegs
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    // Méthode toString
    public String toString() {
        return "Animal Terrestre - Nombre de pattes: " + nbrLegs;
    }
}
