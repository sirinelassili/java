// Classe parente pour les animaux aquatiques
public class Aquatic {
    private String habitat;  // Attribut protégé

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic() {
        this.habitat = "Inconnu";
    }

    // Getter pour habitat
    public String getHabitat() {
        return habitat;
    }

    // Setter pour habitat
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Méthode toString
    public String toString() {
        return "Animal Aquatique - Habitat: " + habitat;
    }

    // Méthode swim
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
