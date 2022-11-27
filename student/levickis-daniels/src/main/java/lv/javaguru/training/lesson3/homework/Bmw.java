package lv.javaguru.training.lesson3.homework;

public class Bmw {
private String colour;
private int power;

public String getColour(){
return this.colour;

}
public int getPower() {
    return this.power;
}
public void setColour (String colour){
    this.colour = colour;
        }
public void setPower (int power){
    this.power = power;
}

public Bmw (String colour, int power){
    this.colour = colour;
    this.power=power;

}



}
