package lv.javaguru.training.lesson3.homework;

public class HairConditionerDemo {

    public static void main(String[] args) {

        HairConditioner hairConditioner = new HairConditioner();
        hairConditioner.setBrand("Garnier");
        hairConditioner.setPackageColor(" Pink ");
        hairConditioner.setMl(250);

        String brand = hairConditioner.getBrand();
        String packageColor = hairConditioner.getPackageColor();
        int ml = hairConditioner.getMl();;

        System.out.println("Hair conditioner brand : " + brand + ", " + "Package color : " + packageColor + "," + " Milliliters : " + ml);
    }
}
