package lv.javaguru.training.homework;

public class Cat {

    private String name;
    private String color;
    private String species;
    private int age;
    private int weight;

    public Cat() {

    }

    public Cat(String name, String color, int age, String species, int weight) {
    }

    String getName() {return name;}

    String getSpecies() {
        return species;
    }

    String getColor() {
        return color;
    }

    int getAge() {
        return age;
    }

    int getWeight() {
        return weight;
    }

    public void setName(String Name) {
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

}




