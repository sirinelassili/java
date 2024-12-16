public class Main {
    public static void main(String[] args) {
        // Création des objets
        Aquatic dolphin = new Aquatic("Dolphin");
        Terrestrial bear = new Terrestrial("Bear");
        Penguin penguin = new Penguin("Penguin");

        // Test des méthodes
        dolphin.eatMeat(Food.MEAT); // Dolphin eats meat
        bear.eatMeat(Food.MEAT);    // Bear eats meat
        bear.eatPlant(Food.PLANT);  // Bear eats plants
        penguin.eatPlantAndMeat(Food.BOTH);  // Penguin eats both meat and plants
    }
}
