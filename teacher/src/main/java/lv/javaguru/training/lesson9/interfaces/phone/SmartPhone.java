package lv.javaguru.training.lesson9.interfaces.phone;

public class SmartPhone implements Phone, Camera, Gps {

    @Override
    public void takePhoto() {
        System.out.println("Takes photo.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Records video.");
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracks location.");
    }

    @Override
    public void call() {
        System.out.println("Calls.");
    }

    @Override
    public void sendSms() {
        System.out.println("Sends sms.");
    }

}
