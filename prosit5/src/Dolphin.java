// Classe Dolphin héritant de Aquatic
public class Dolphin extends Aquatic {
    private float swimmingSpeed;  // Attribut protégé

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);  // Appel du constructeur parent
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin() {
        super("Océan");
        this.swimmingSpeed = 0.0f;
    }

    // Getter pour swimmingSpeed
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    // Setter pour swimmingSpeed
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // Méthode toString
    @Override
    public String toString() {
        return super.toString() + ", Dauphin - Vitesse de nage: " + swimmingSpeed + " km/h";
    }

    // Méthode swim
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
