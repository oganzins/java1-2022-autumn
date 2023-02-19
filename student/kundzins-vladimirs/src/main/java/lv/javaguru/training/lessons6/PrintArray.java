package lv.javaguru.training.lessons6;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = " Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

        System.out.println(Arrays.toString(daysOfWeek));



    }
}
