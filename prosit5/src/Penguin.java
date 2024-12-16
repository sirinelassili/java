// Classe Penguin héritant de Aquatic
public class Penguin extends Aquatic {
    private float swimmingDepth;  // Attribut protégé

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);  // Appel du constructeur parent
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() {
        super("Antarctique");
        this.swimmingDepth = 0.0f;
    }

    // Getter pour swimmingDepth
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    // Setter pour swimmingDepth
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    // Méthode toString
    @Override
    public String toString() {
        return super.toString() + ", Pingouin - Profondeur de nage: " + swimmingDepth + " m";
    }

    // Méthode swim
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
