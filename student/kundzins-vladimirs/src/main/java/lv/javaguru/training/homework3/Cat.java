package lv.javaguru.training.homework3;

public class Cat {

    private String name;
    private String color;
    private String species;
    private int age;
    private double weight;

    Cat() {
    }

    Cat(String name, String color, String species, int age, double weight) {
        this.name = name;
        this.color = color;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String getName(String garfild) {
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

    public double getWeight() {
        return weight;
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

    public void printInfo() {
        System.out.println("Kaku vards " + name);
        System.out.println("Kaku krasa " + color);
        System.out.println("Kaku suga " + species);
        System.out.println("Kaku vecums " + age);
        System.out.println("Kaku svars " + weight);
    }

}




