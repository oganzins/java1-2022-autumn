package homework;

public class Cat {

    String name;
    String color;
    String species;
    int age;
    double weight;

    public Cat() {};

    public Cat(String name) {
        this.name = name;
    }
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

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


    public static void main(String[] args) {
        Cat Cat1 = new Cat ();
        Cat Cat2 = new Cat ("Mincis2");
        Cat Cat3 = new Cat ("Mincis3","Melns",4);

        public void printInfo() {
        System.out.println("Kaķa vārds: " + Cat1.getName());
        System.out.println("Kaķa vārds: " + Cat2.getName());
        System.out.println("Kaķa vārds: " + Cat3.getName());
        }
}
