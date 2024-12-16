public class Aquatic implements Carnivore<Food> {
    private String name;

    public Aquatic(String name) {
        this.name = name;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " cannot eat this food.");
        }
    }
}
