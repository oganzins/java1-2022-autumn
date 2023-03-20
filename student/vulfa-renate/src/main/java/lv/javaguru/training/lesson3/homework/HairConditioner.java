package lv.javaguru.training.lesson3.homework;

public class HairConditioner {
    String brand;
    String packageColor;
    int ml;


    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPackageColor(String packageColor){
        this.packageColor = packageColor;
    }

    public void setMl(int ml){
        this.ml = ml;
    }


    public String getBrand() {
        return brand;
    }


    public String getPackageColor() {
        return packageColor;
    }

    public int getMl() {
        return ml;
    }

}
