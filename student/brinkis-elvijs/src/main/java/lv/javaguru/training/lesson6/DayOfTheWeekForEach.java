package lv.javaguru.training.lesson6;

public class DayOfTheWeekForEach {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday", "Sunday" } ;

        for (String day : daysOfWeek) {
            System.out.println(day);
        }
        /*
        for (int i = 0; i < daysOfWeek.length; i++) {
            String day = daysOfWeek[i];
            System.out.println(day);

          }

         */
    }
}
