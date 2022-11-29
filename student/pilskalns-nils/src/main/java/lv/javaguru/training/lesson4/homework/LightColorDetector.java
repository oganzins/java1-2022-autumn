package lv.javaguru.training.lesson4.homework;

/*
    Homework accepted
 */
public class LightColorDetector {
    public String detect(int waveLenght) {
        if ((waveLenght >= 380) && (waveLenght <= 449)) {
            return "Violet";
        } else if ((waveLenght >= 450) && (waveLenght <= 494)) {
            return "Blue";
        } else if ((waveLenght >= 495) && (waveLenght <= 569)) {
            return "Green";
        } else if ((waveLenght >= 570) && (waveLenght <= 589)) {
            return "Yellow";
        } else if ((waveLenght >= 590) && (waveLenght <= 619)) {
            return "Orange";
        } else if ((waveLenght >= 620) && (waveLenght <= 750)) {
            return "Red";
        } else {
            return "Invisible light";
        }
    }

    public void printColor(int waveLenght) {
        System.out.println("If light wavelenght is " + waveLenght + " then light color is " + detect(waveLenght));
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
