package lv.javaguru.training.lesson4.homework;

public class LightColorDetector {
    private static Object printColor;

    public static String detect(int waveLength){
        if((waveLength >=380) && (waveLength <= 449)){
            return "Violet";
        } else if ((waveLength >= 450) && (waveLength <= 494)) {
            return "Blue";
        } else if ((waveLength >= 495) && (waveLength <= 569)) {
            return "Green";
        } else if ((waveLength >= 570) && (waveLength <= 589)) {
            return "Yellow";
        } else if ((waveLength >= 590) && (waveLength <= 619)) {
            return "Orange";
        } else if ((waveLength >= 620) && (waveLength <= 750)) {
            return "Red";
        }else{
            return "Invisible light";
        }
    }

    public static void printColor(int waveLength){
        System.out.println("If light wave length is " + waveLength + " then light color is " + detect(waveLength));
    }

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();

        LightColorDetector.printColor(-1);
        LightColorDetector.printColor(100);
        LightColorDetector.printColor(380);
        LightColorDetector.printColor(460);
        LightColorDetector.printColor(569);
        LightColorDetector.printColor(600);
        LightColorDetector.printColor(750);
        LightColorDetector.printColor(1200);
    }
}
