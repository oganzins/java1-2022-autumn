package lv.javaguru.training.homework4;

public class LightColorDetector {

    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        }
        else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        }
        else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        }
        else if (wavelength >= 590 && wavelength <= 690) {
            return "Orange";
        }
        else if (wavelength >= 620 && wavelength <= 720) {
            return "Red";
        }
        else return "Invisible light";



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
