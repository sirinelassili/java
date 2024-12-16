// Classe principale avec la méthode main
public class Main {
    public static void main(String[] args) {
        // Création des objets avec les constructeurs par défaut
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        Aquatic aquaticAnimal = new Aquatic();  // Exemple d'animal aquatique générique

        // Affichage des objets avec la méthode toString
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());
        System.out.println(aquaticAnimal.toString());

        // Appel de la méthode swim pour chaque objet
        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();
    }
}
