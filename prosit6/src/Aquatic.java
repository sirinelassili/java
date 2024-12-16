public abstract class Aquatic {
    private String name;
    private int age;
    private String habitat;

    public Aquatic(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    // Méthode abstract swim() à redéfinir dans les classes filles
    public abstract void swim();

    // Méthode equals redéfinie
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return name.equals(aquatic.name) && age == aquatic.age && habitat.equals(aquatic.habitat);
    }
}
