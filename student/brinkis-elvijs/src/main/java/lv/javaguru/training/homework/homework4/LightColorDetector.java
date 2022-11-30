package lv.javaguru.training.homework.homework4;

import javax.swing.*;

public class LightColorDetector {
    public String detect( int wavelenght) {
        if ((wavelenght >= 380) && (wavelenght <= 494)) {
            return "Violet";
        }
        if ((wavelenght >= 450) && (wavelenght <= 494)) {
            return "Blue";
        }
        if ((wavelenght >= 495) && (wavelenght <= 569)) {
            return "Green";
        }
        if ((wavelenght >= 570) && (wavelenght <= 589)) {
            return "Yellow";
        }
        if ((wavelenght >= 590) && (wavelenght <= 619)) {
            return "Orange";
        }
        if ((wavelenght >= 620) && (wavelenght <= 750)) {
        } else {
            return  "Invisible light";
        }

        return null;
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
