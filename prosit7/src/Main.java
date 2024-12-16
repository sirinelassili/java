public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        try {
            // Tentatives d'ajout d'animaux
            Animal animal1 = new Animal("Dauphin", 5);
            zoo.addAnimal(animal1); // Ajoute un dauphin
            Animal animal2 = new Animal("Pingouin", 3);
            zoo.addAnimal(animal2); // Ajoute un pingouin
            Animal animal3 = new Animal("Lion", 7);
            zoo.addAnimal(animal3); // Ajoute un lion

            // Essayer d'ajouter un 4ème animal (devrait lever l'exception ZooFullException)
            Animal animal4 = new Animal("Elephant", 10);
            zoo.addAnimal(animal4);

        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
