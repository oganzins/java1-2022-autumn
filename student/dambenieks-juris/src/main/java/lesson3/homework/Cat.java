package lesson3.homework;

/*
    Homework accepted
 */
public class Cat {

    private String name;
    private String color;
    private String species;
    private int age;
    private double weight;

    Cat() {
    }


    Cat(String name) {
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

    public void setWeight(int weight) {
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
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

}




