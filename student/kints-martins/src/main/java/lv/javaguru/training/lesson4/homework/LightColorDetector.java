package lv.javaguru.training.lesson4.homework;

public class LightColorDetector {

    public String detect(int wavelenght) {
        if (wavelenght >= 380 && wavelenght <= 449) {
            return "Violet";
        } else if (wavelenght >= 450 && wavelenght <= 494) {
            return "Blue";
        } else if (wavelenght >= 495 && wavelenght <= 569) {
            return "Green";
        } else if (wavelenght >= 570 && wavelenght <= 589) {
            return "Yellow";
        } else if (wavelenght >= 590 && wavelenght <= 619) {
            return "Orange";
        } else if (wavelenght >= 620 && wavelenght <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

    public void printColor(int wavelenght) {
        System.out.println("If light wavelenght is " + wavelenght + " then light color is " + detect(wavelenght));
    }

    public static void main(String[] args) {
        LightColorDetector lightDetector = new LightColorDetector();

        lightDetector.printColor(-1);
        lightDetector.printColor(100);
        lightDetector.printColor(380);
        lightDetector.printColor(460);
        lightDetector.printColor(569);
        lightDetector.printColor(600);
        lightDetector.printColor(750);
        lightDetector.printColor(1200);

    }

}
