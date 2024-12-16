public class Main {
    public static void main(String[] args) {
        try {
            Entreprise entreprise = new Entreprise();
            Produit produit1 = new Produit(1, "Projet1", "ClientA", 1000, "2023-12-10");
            Service service1 = new Service(2, "Projet2", "ClientB", 10, 50);

            entreprise.ajouterPrestation(produit1);
            entreprise.ajouterPrestation(service1);

            entreprise.afficherNbrPrestation();
            entreprise.totalVentesProduits();
            entreprise.topServiceClient();

            // Test des autres méthodes
            entreprise.afficherClient().forEach(System.out::println);
            entreprise.afficherProjects().forEach(System.out::println);

        } catch (PrestationExisteException e) {
            e.printStackTrace();
        }
    }
}
