public class Zoo {
    private Animal[] animals; // Tableau d'animaux
    private int count; // Nombre d'animaux dans le zoo

    public Zoo() {
        this.animals = new Animal[3]; // Le zoo peut contenir 3 animaux
        this.count = 0;
    }

    // Ajoute un animal dans le zoo, lève des exceptions si nécessaire
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }
        if (count >= animals.length) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter un autre animal.");
        }
        animals[count] = animal;
        count++;
        System.out.println("Nombre d'animaux dans le zoo : " + count);
    }
}
