package lv.javaguru.training.lesson3.Homework;

class CatDemo {
    private String catName;
    private String catColor;

    private int catAge;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setCatName("Garfield");
        cat.setCatColor("Ginger");
        cat.setCatAge(6);
        cat.setCatSpecies("None");
        cat.setCatWeight(15);

        Cat cat2 = new Cat();
        cat2.setCatName("Garfield");

        Cat cat3 = new Cat();
        cat3.setCatName("Garfield");
        cat3.setCatColor("Ginger");
        cat3.setCatAge(6);

        cat.printInfo();
        cat2.printInfo();
        cat3.printInfo();


    }
}