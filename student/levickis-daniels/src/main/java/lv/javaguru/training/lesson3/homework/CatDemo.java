package lv.javaguru.training.lesson3.homework;

/*
    Homework accepted
 */
public class CatDemo {

    public static void main(String[] args) {
        Cat catWithOutName = new Cat();
        Cat catName = new Cat("kakis");
        Cat catAll = new Cat("kakis", "black", 9);
        System.out.println(catAll.getName() + " " + catAll.getColor() + " " + catAll.getAge());
        catAll.setName("Lesters");
        catAll.setColor("Grey");
        catAll.setAge(5);
        System.out.println(catAll.getName() + " " + catAll.getColor() + " " + catAll.getAge());
        catAll.printInfo();


    }


}
