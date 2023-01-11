package lv.javaguru.training.lesson10.address;

import java.util.ArrayList;
import java.util.List;

public class MyPhoneBook implements PhoneBook {

    private List<Record> records;

    public MyPhoneBook() {
        records = new ArrayList<>();
    }

    @Override
    public void add(Record record) {
        records.add(record);
    }

    @Override
    public int recordCount() {
        return records.size();
    }

    @Override
    public Record find(String firstName, String lastName) {
        for (Record record : records) {
            if (record.getFirstName().equals(firstName)
                    && record.getLastName().equals(lastName)) {
                return record;
            }
        }
        return null;
    }

    @Override
    public void delete(Record record) {
        records.remove(record);
    }

    @Override
    public List<Record> findByFirstName(String firstName) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getFirstName().equals(firstName)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }

    @Override
    public List<Record> findByLastName(String lastName) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getLastName().equals(lastName)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }

    @Override
    public int getRecordNumber(Record record) {
        int index = records.indexOf(record);
        if (index == -1) {
            return 0;
        } else {
            return index + 1;
        }
    }

}
