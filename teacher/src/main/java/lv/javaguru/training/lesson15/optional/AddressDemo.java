package lv.javaguru.training.lesson15.optional;

public class AddressDemo {

    public static void main(String[] args) {
        Address firstAddress = new Address("Latvia", "LV-1001", "Matisa iela 45 - 9, Riga");
        Address secondAddress = new Address("Latvia", null, "Matisa iela 45 - 9, Riga");
        Address thirdAddress = new Address("Latvia", "LV-3200", null);

        System.out.println(firstAddress.getFullAddress());
        System.out.println(secondAddress.getFullAddress());
        System.out.println(thirdAddress.getFullAddress());
    }

}
