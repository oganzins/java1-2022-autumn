package lv.javaguru.training.lesson3.homework;

public class Cat {
    public String name;
    public String color;
    public String species;
    public int age;
    public double weight;

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

    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        Cat CatDemo = new Cat();
        CatDemo.setName("Armands");
        CatDemo.setColor("Red");
        CatDemo.setSpecies("Manecoon");
        CatDemo.setAge(3);
        CatDemo.setWeight(9.5);

        CatDemo.firstCat();


        Cat CatDemo1 = new Cat("Odins");
        CatDemo1.setColor("White");
        CatDemo1.setSpecies("Persian");
        CatDemo1.setAge(7);
        CatDemo1.setWeight(12);

        CatDemo1.secondCat();


        Cat CatDemo2 = new Cat("Bruno", "Black", 3);
        CatDemo2.setSpecies("Unknown");
        CatDemo2.setAge(1);
        CatDemo2.setWeight(5);

        CatDemo2.thirdCat();


    }

    public void firstCat() {
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's color: " + color);
        System.out.println("Cat's species: " + species);
        System.out.println("Cat's age: " + age);
        System.out.println("Cat's weight: " + weight);
    }

    public void secondCat() {
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's color: " + color);
        System.out.println("Cat's species: " + species);
        System.out.println("Cat's age: " + age);
        System.out.println("Cat's weight: " + weight);
    }

    public void thirdCat() {
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's color: " + color);
        System.out.println("Cat's species: " + species);
        System.out.println("Cat's age: " + age);
        System.out.println("Cat's weight: " + weight);
    }
}
