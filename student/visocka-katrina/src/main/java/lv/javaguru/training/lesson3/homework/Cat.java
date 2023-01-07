package lv.javaguru.training.lesson3.homework;

public class Cat {
    String name;
    String color;
    String species;
    int age;
    int weight;

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

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Cat's name: " + name +
                ", Cat's color: " + color +
                ", Cat's species: " + species +
                ", Cat's age: " + age +
                ", Cat's weight: " + weight);


    }
}
