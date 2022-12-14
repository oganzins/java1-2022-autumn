package lv.javaguru.training.lesson7;

import java.time.LocalDate;

public class LocalDateEqualsExample {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 1);

        System.out.println("date1.equals(date2) " + date1.equals(date2));
    }

}
