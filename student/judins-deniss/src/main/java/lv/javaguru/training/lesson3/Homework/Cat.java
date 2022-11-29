package lv.javaguru.training.lesson3.Homework;

/*
    Homework accepted
 */
public class Cat {
    String name;
    String color;
    String species;
    int age;
    float weight;

    Cat() {
    }

    Cat(String name) {

    }

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getCatName() {
        return name;
    }

    public String getCatColor() {
        return color;
    }

    public String getCatSpecies() {
        return species;
    }

    public int getCatAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }


    public void setCatName(String newValue) {
        name = newValue;
    }

    public void setCatColor(String newValue) {
        color = newValue;
    }

    public void setCatSpecies(String newValue) {
        species = newValue;
    }

    public void setCatAge(int newValue) {
        age = newValue;
    }

    public void setCatWeight(float newValue) {
        weight = newValue;
    }

    public void printInfo() {
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's age: " + age);
        System.out.println("Cat's weight: " + weight);
        System.out.println("Cat's color: " + color);
        System.out.println("Cat's species: " + species);
    }
}

