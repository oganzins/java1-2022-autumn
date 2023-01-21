package lv.javaguru.training.lesson4.homework;

public class LightColorDetector {
    public String detect(int waveLength) {
        if (waveLength >= 380 && waveLength <= 449) {
            return "Violet";
        } else if (waveLength >= 450 && waveLength <= 494) {
            return "Blue";
        } else if (waveLength >= 495 && waveLength <= 569) {
            return "Green";
        } else if (waveLength >= 570 && waveLength <= 589) {
            return "Yellow";
        } else if (waveLength >= 590 && waveLength <= 619) {
            return "Orange";
        } else if (waveLength >= 620 && waveLength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
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
