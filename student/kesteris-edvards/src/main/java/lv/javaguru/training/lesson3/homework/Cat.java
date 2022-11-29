package lv.javaguru.training.lesson3.homework;

/*
    Homework accepted
 */
public class Cat {
    String name;
    String color;
    String species;
    int age;
    double weight;


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

    public void printInfo() {
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's color: " + color);
        System.out.println("Cat's species: " + species);
        System.out.println("Cat's age: " + age);
        System.out.println("Cat's weight: " + weight);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
