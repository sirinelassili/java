import java.util.Objects;

public abstract class Prestation {
    protected int id;
    protected String nom_projet;
    protected String nom_client;

    // Constructeur vide
    public Prestation() {}

    // Constructeur paramétré
    public Prestation(int id, String nom_projet, String nom_client) {
        this.id = id;
        this.nom_projet = nom_projet;
        this.nom_client = nom_client;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_projet() {
        return nom_projet;
    }

    public void setNom_projet(String nom_projet) {
        this.nom_projet = nom_projet;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Prestation{id=" + id + ", nom_projet='" + nom_projet + "', nom_client='" + nom_client + "'}";
    }

    // Redéfinition de hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Redéfinition de equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prestation that = (Prestation) obj;
        return id == that.id;
    }
}
