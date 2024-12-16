public class Terrestrial implements Omnivore<Food> {
    private String name;

    public Terrestrial(String name) {
        this.name = name;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " does not eat meat.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " is eating plants.");
        } else {
            System.out.println(name + " does not eat plants.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " is eating both plants and meat.");
        }
    }
}
