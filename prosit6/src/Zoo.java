public class Zoo {
    private Aquatic[] aquaticAnimals; // Tableau d'animaux aquatiques
    private int count; // Nombre d'animaux aquatiques ajoutés

    public Zoo() {
        this.aquaticAnimals = new Aquatic[10]; // Initialisation du tableau avec une taille maximale de 10
        this.count = 0;
    }

    // Ajout d'un animal aquatique
    public void addAquaticAnimal(Aquatic aquatic) {
        if (count < aquaticAnimals.length) {
            aquaticAnimals[count] = aquatic;
            count++;
        } else {
            System.out.println("Le zoo ne peut pas contenir plus de 10 animaux aquatiques.");
        }
    }

    // Affiche la méthode swim() de tous les animaux aquatiques
    public void displaySwim() {
        for (int i = 0; i < count; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // Méthode pour renvoyer la profondeur maximale de nage des pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < count; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getMaxSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }

    // Affiche le nombre de dauphins et de pingouins
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < count; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }
}
