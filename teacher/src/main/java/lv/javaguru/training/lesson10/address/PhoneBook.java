package lv.javaguru.training.lesson10.address;

import java.util.List;

public interface PhoneBook {

    void add(Record record);

    int recordCount();

    Record find(String firstName, String lastName);

    void delete(Record record);

    List<Record> findByFirstName(String firstName);

    List<Record> findByLastName(String lastName);

    int getRecordNumber(Record record);

}
