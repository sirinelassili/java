public class Dolphin extends Aquatic {

    public Dolphin(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    // Redéfinition de la méthode swim()
    @Override
    public void swim() {
        System.out.println("Le dauphin " + getName() + " nage rapidement !");
    }
}
