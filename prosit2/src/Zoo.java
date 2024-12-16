public class Zoo {
    String name;
    String city;
    int nbrCages;
    Animal[] animals;
    public Zoo (String name,String city,int nbrCages)
    {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo()
    {
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.nbrCages);
    }
}
