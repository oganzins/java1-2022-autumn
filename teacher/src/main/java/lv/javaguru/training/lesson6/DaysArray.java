package lv.javaguru.training.lesson6;

public class DaysArray {

    public static void main(String[] args) {
        System.out.println(getDay(5));
    }

    public static String getDay(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            return days[dayNumber - 1];
        } else {
            return "";
        }

    }

}
