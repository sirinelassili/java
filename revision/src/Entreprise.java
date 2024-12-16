import java.util.*;
import java.util.stream.*;

public class Entreprise {
    private List<Prestation> prestations;

    // Constructeur vide
    public Entreprise() {
        prestations = new ArrayList<>();
    }

    // Ajouter une prestation
    public void ajouterPrestation(Prestation p) throws PrestationExisteException {
        if (prestations.contains(p)) {
            throw new PrestationExisteException("La prestation existe déjà !");
        }
        prestations.add(p);
    }

    // Afficher le nombre de prestations par type
    public void afficherNbrPrestation() {
        long produitsCount = prestations.stream().filter(p -> p instanceof Produit).count();
        long servicesCount = prestations.stream().filter(p -> p instanceof Service).count();
        System.out.println("Nombre de produits : " + produitsCount);
        System.out.println("Nombre de services : " + servicesCount);
    }

    // Prestations par client
    public List<Prestation> prestationparClient(String client) {
        return prestations.stream()
                .filter(p -> p.getNom_client().equals(client))
                .collect(Collectors.toList());
    }

    // Filtrer par client
    public Map<String, List<Prestation>> filterParClient() {
        return prestations.stream()
                .collect(Collectors.groupingBy(Prestation::getNom_client));
    }

    // Afficher les clients
    public List<String> afficherClient() {
        return prestations.stream()
                .map(Prestation::getNom_client)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // Afficher les projets
    public List<String> afficherProjects() {
        return prestations.stream()
                .map(Prestation::getNom_projet)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // Récupérer les services et leurs prix
    public Map<Service, Integer> recupererServices() {
        return prestations.stream()
                .filter(p -> p instanceof Service)
                .map(p -> (Service) p)
                .collect(Collectors.toMap(
                        service -> service,
                        service -> service.getNombre_heures() * service.getPrix_heure
                ));
    }

    // Total des ventes de produits en 2023
    public void totalVentesProduits() {
        int total = prestations.stream()
                .filter(p -> p instanceof Produit)
                .map(p -> (Produit) p)
                .filter(p -> p.getDate_livraison().startsWith("2023"))
                .mapToInt(Produit::getPrix_total)
                .sum();
        System.out.println("Total des ventes de produits en 2023 : " + total);
    }

    // Top service client
    public void topServiceClient() {
        prestations.stream()
                .filter(p -> p instanceof Service)
                .map(p -> (Service) p)
                .collect(Collectors.groupingBy(Service::getNom_client,
                        Collectors.summingInt(s -> s.getNombre_heures() * s.getPrix_heure)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Meilleur client : " + entry.getKey()));
    }
}
