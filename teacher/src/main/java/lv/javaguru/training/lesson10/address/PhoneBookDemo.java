package lv.javaguru.training.lesson10.address;

import java.util.List;

public class PhoneBookDemo {

    public static void main(String[] args) {
        PhoneBook phoneBook = new MyPhoneBook();
        phoneBook.add(new Record("Jānis", "Bērziņš", "+37122223333"));
        phoneBook.add(new Record("Oļegs", "Ganzins", "+37166665555"));
        phoneBook.add(new Record("Dace", "Bērziņa", "+371000011111"));
        phoneBook.add(new Record("Jānis", "Kalniņš", "+37188889999"));
        phoneBook.add(new Record("Pēteris", "Bērziņš", "+371444455555"));

        System.out.println(phoneBook.recordCount());

        Record recordToBeDeleted = phoneBook.find("Oļegs", "Ganzins");

        int recordNumber= phoneBook.getRecordNumber(new Record("Oļegs", "Ganzins", "+37166665555"));

        System.out.println(recordNumber);
        phoneBook.delete(recordToBeDeleted);

        System.out.println(phoneBook.recordCount());
        System.out.println(phoneBook.find("Oļegs", "Ganzins"));

        List<Record> foundByFirstName = phoneBook.findByFirstName("Jānis");
        System.out.println(foundByFirstName);

        List<Record> foundByLastName = phoneBook.findByLastName("Bērziņš");
        System.out.println(foundByLastName);
    }

}
