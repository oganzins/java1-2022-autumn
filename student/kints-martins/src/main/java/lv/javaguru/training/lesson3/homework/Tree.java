package lv.javaguru.training.lesson3.homework;

public class Tree {

    String name;
    String specie;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tree {" +
                "name= '" + name + '\'' +
                ", specie= '" + specie + '\'' +
                ", age= " + age +
                '}';
    }
}
