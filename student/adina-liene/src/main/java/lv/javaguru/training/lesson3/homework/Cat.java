package lv.javaguru.training.lesson3.homework;

/*
    Homework accepted.
 */
public class Cat {

    String name;
    String color;
    String species;
    double age;
    double weight;

    Cat() {

    }

    Cat(String name) {
        this.name = name;
    }

    Cat(String name, String color, double age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's color: " + color);
        System.out.println("Cat's species: " + species);
        System.out.println("Cat's age: " + age);
        System.out.println("Cat's weight: " + weight);
    }


}


