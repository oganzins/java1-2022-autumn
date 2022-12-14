package lv.javaguru.training.lesson6;

import java.lang.reflect.Array;

public class DaysOfTheWeekIntialized {
    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday", "Sunday"};

      /*  System.out.println(daysOfTheWeek[2]);
        System.out.println(daysOfTheWeek.length);

       */
        for (int i = 0; i < 7; i++) {
            String day = daysOfTheWeek[i];
            System.out.println(day);


        }


    }
}

