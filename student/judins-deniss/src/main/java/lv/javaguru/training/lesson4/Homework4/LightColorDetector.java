package lv.javaguru.training.lesson4.Homework4;

public class LightColorDetector {

    public String detect(int wavelenght) {

        if (wavelenght >= 380 && wavelenght <= 449) {
            return "Violet";
        }
        else if (wavelenght >= 450 && wavelenght <= 494) {
            return "Blue";
        }
        else if (wavelenght >= 495 && wavelenght <= 569) {
            return "Green";
        }
        else if (wavelenght >= 570 && wavelenght <= 589) {
            return "Yellow";
        }
        else if (wavelenght >= 590 && wavelenght <= 619) {
            return "Orange";
        }
        else if (wavelenght >= 620 && wavelenght <= 750) {
            return "Red";
        }
        else { return "Invisible Light";
        }
    }
    public void printColor(int wavelenght) {
        System.out.println("If light wavelenght is " + wavelenght + " then light color is " + detect(wavelenght));

        }

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();

        lightColorDetector.printColor(-1);
        lightColorDetector.printColor(100);
        lightColorDetector.printColor(380);
        lightColorDetector.printColor(460);
        lightColorDetector.printColor(569);
        lightColorDetector.printColor(600);
        lightColorDetector.printColor(750);
        lightColorDetector.printColor(1200);
    }
}
