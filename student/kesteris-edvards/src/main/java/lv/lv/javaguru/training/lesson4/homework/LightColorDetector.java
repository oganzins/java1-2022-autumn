package lv.lv.javaguru.training.lesson4.homework;

/*
    Homework accepted
 */
public class LightColorDetector {

    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        }
        if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        }
        if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        }
        if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        }
        if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        }
        if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else return "Invisible Light";
    }

    public void printColor(int wavelength) {
        System.out.println("If light wavelength is " + wavelength + " then light color is " + detect(wavelength));
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
