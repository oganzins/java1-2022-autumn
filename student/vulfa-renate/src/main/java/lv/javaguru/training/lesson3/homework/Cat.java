package lv.javaguru.training.lesson3.homework;

public class Cat {
    public String name;
    public String color;
    public String species;
    public int age;
    public double weight;

    Cat(){

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

    public void setWeight(double weight) {
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void printInfo(){
        System.out.println("Cat's name : " + name);
        System.out.println("Cat's color : " + color);
        System.out.println("Cat's species : " + species);
        System.out.println("Cat's age : " + age);
        System.out.println("Cat's weight : " + weight);
    }
}
