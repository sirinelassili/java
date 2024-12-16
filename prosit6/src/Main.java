public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Ajout de dauphins et de pingouins dans le zoo
        zoo.addAquaticAnimal(new Dolphin("Flipper", 5, "Océan"));
        zoo.addAquaticAnimal(new Penguin("Pingu", 3, "Arctique", 50));
        zoo.addAquaticAnimal(new Dolphin("Dolly", 7, "Mer"));
        zoo.addAquaticAnimal(new Penguin("Rocky", 4, "Antarctique", 60));

        // Affichage de la méthode swim() pour tous les animaux aquatiques
        zoo.displaySwim();

        // Affichage de la profondeur maximale de nage des pingouins
        System.out.println("Profondeur maximale de nage des pingouins : " + zoo.maxPenguinSwimmingDepth() + " mètres");

        // Affichage du nombre de dauphins et de pingouins
        zoo.displayNumberOfAquaticsByType();

        // Test de la méthode equals()
        Dolphin dolphin1 = new Dolphin("Flipper", 5, "Océan");
        Dolphin dolphin2 = new Dolphin("Flipper", 5, "Océan");
        System.out.println("Les dauphins sont-ils égaux ? " + dolphin1.equals(dolphin2));
    }
}
