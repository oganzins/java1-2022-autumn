package lv.javaguru.training.lessons6;

public class DaysOfTheWeekInitialized {

    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursdaj", "Friday", "Saturday", "Sunday"};

     /*   System.out.println(daysOfTheWeek[2]);
        System.out.println(daysOfTheWeek.length); */

        for (int i = 0; i < 7; i++) {
            String day = daysOfTheWeek[i];
            System.out.println(day);
        }
    }
}
