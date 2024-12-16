public class Penguin extends Aquatic {
    private float maxSwimmingDepth;

    public Penguin(String name, int age, String habitat, float maxSwimmingDepth) {
        super(name, age, habitat);
        this.maxSwimmingDepth = maxSwimmingDepth;
    }

    public float getMaxSwimmingDepth() {
        return maxSwimmingDepth;
    }

    // Redéfinition de la méthode swim()
    @Override
    public void swim() {
        System.out.println("Le pingouin " + getName() + " nage sous l'eau !");
    }
}
