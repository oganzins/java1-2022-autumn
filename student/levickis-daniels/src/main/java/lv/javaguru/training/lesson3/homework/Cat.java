package lv.javaguru.training.lesson3.homework;

/*
    Homework accepted
 */
public class Cat {

    public String name;
    private String color;
    private String species;
    int age;
    int weight;


    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void printInfo() {
        System.out.println("Cat's name: " + name + ", " + "Cat`s color" + ": " + color + ", " + "Cat`s age:" + " " + age);
    }


}