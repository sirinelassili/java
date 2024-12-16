public class Service extends Prestation {
    private int nombre_heures;
    private int prix_heure;

    // Constructeur vide
    public Service() {}

    // Constructeur paramétré
    public Service(int id, String nom_projet, String nom_client, int nombre_heures, int prix_heure) {
        super(id, nom_projet, nom_client);
        this.nombre_heures = nombre_heures;
        this.prix_heure = prix_heure;
    }

    // Getters et setters
    public int getNombre_heures() {
        return nombre_heures;
    }

    public void setNombre_heures(int nombre_heures) {
        this.nombre_heures = nombre_heures;
    }

    public int getPrix_heure() {
        return prix_heure;
    }

    public void setPrix_heure(int prix_heure) {
        this.prix_heure = prix_heure;
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Service{id=" + id + ", nom_projet='" + nom_projet + "', nom_client='" + nom_client +
                "', nombre_heures=" + nombre_heures + ", prix_heure=" + prix_heure + "}";
    }
}
