package lv.javaguru.training.lesson9.interfaces.phone;

public class SmartPhoneDemo {

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.call();
        phone.recordVideo();
        phone.sendSms();
        phone.takePhoto();
        phone.trackLocation();

    }

}
