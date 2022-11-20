package lv.javaguru.training;

public class Cat {

    public String name;
    public String color;
    public String species;
    public int age;
    public double weight;

    Cat() {
        this.name = name;

    }
    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public String getSpecies() {
        return this.species;
    }
    public int getAge() {
        return age;
    }
    public double weight() {
        return weight;
    }
    public static void main(String[] args) {
        Cat DemoCat = new Cat();
        DemoCat.setName("Kira");
        DemoCat.setSpecies("Ragdolls");
        DemoCat.setColor("Melna");
        DemoCat.setAge(6);
        DemoCat.setWeight(7);

        DemoCat.firstCat();

        }

    private void firstCat() {
        System.out.println("Cats Name-" + name);
        System.out.println("Cats Color-" + color);
        System.out.println("Cats Species-" + species);
        System.out.println("Cats Age-" + age);
        System.out.println("Cats weight-" + weight);
    }


}
