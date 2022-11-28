package lesson4.homework;

public class LightColorDetector {
    
    int waweLenght;
   
    public String detect(int waweLenght) {
        
        if (waweLenght >= 380 && waweLenght <= 449) {
            return "Violet";
        } else if (waweLenght >= 450 && waweLenght <= 494) {
            return "Blue";
        } else if (waweLenght >= 495 && waweLenght <= 569) {
            return "Green";
        } else if (waweLenght >= 570 && waweLenght <= 589) {
            return "Yellow";
        } else if (waweLenght >= 590 && waweLenght <= 619) {
            return "Orange";
        } else if (waweLenght >= 620 && waweLenght <= 750) {
            return "red";
        } else {
            return "Invisible light";
        }}


    public void printColor(int waweLenght) {
        System.out.println("If light waweLenght is " + waweLenght + " Then light color is " + detect(waweLenght));
    }

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector(); {
            System.out.println(lightColorDetector.detect(-1));
            System.out.println(lightColorDetector.detect(100));
            System.out.println(lightColorDetector.detect(380));
            System.out.println(lightColorDetector.detect(460));
            System.out.println(lightColorDetector.detect(569));
            System.out.println(lightColorDetector.detect(600));
            System.out.println(lightColorDetector.detect(750));
            System.out.println(lightColorDetector.detect(1200));
        }
    }}
            

