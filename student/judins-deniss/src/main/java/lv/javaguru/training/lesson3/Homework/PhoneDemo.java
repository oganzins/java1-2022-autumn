package lv.javaguru.training.lesson3.Homework;

public class PhoneDemo {
    private String maker;
    private String model;
    private String color;
    private int year;
    private int ram;
    private int memorie;
    private float price;

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.setMaker("Apple");
        phone1.setModel("Iphone 14 Pro");
        phone1.setColor("Gold");
        phone1.setYear(2022);
        phone1.setRam(6);
        phone1.setMemorie(512);
        phone1.setPrice((float) 1729.00);

        Phone phone2 = new Phone();
        phone2.setMaker("Samsung");
        phone2.setModel("Galaxy Fold 4");
        phone2.setColor("Black");
        phone2.setYear(2022);
        phone2.setRam(12);
        phone2.setMemorie(256);
        phone2.setPrice((float) 1669.00);

        Phone phone3 = new Phone();
        phone3.setMaker("Asus");
        phone3.setModel("ROG phone 6");
        phone3.setColor("Black");
        phone3.setYear(2022);
        phone3.setRam(16);
        phone3.setMemorie(512);
        phone3.setPrice((float) 1299.00);

        System.out.println("_______________________________________________________________");
        phone1.printinfo();
        System.out.println("_______________________________________________________________");
        phone2.printinfo();
        System.out.println("_______________________________________________________________");
        phone3.printinfo();
        System.out.println("_______________________________________________________________");
    }
}
