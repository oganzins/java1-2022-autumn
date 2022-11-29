package lv.javaguru.training.lesson3.homework;

/*
    Homework accepted
 */
public class Shirt {
    public String brand;
    public String color;
    public String gender;

    public String size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Shirt Shirt = new Shirt();

        Shirt.brand = "Gucci";
        Shirt.color = "Red";
        Shirt.gender = "Female";
        Shirt.size = "L";
        String shirtsBrand = Shirt.getBrand();
        String shirtsColor = Shirt.getColor();
        String shirtsGender = Shirt.getGender();
        String shirtSize = Shirt.getSize();

        System.out.println("Shirts brand: " + shirtsBrand + "; Shirts color: " + shirtsColor + "; Shirts gender: " + shirtsGender + "; Shirts size: " + shirtSize);


        Shirt.setBrand("EA7");
        Shirt.setColor("White");
        Shirt.setGender("Male");
        Shirt.setSize("XXL");

        Shirt.firstShirt();
    }

    public void firstShirt() {
        System.out.println("Shirts Brand: " + brand);
        System.out.println("Shirts Color: " + color);
        System.out.println("Shirts Gender: " + gender);
        System.out.println("Shirts Size: " + size);
    }

}

