package lv.javaguru.training;

public class LightDetector {

    public String detect(int wavelength) {
        return null;
    }

    public void printColor(int wavelength) {
        System.out.println("If light wavelength is " + wavelength + " then light color is " + detect(wavelength));
    }

    public static void main(String[] args) {
        LightDetector lightDetector = new LightDetector();

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
