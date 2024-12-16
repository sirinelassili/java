public class Penguin extends Aquatic implements Omnivore<Food> {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(super.name + " is eating both plants and meat.");
        }
    }
}
