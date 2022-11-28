package lv.lv.javaguru.training.lesson4.homework;

public class DaysOfWeek {

    public String getDayName(int dayNumber) {

        String monthName;

        switch (dayNumber) {
            case 1: {
                monthName = "Monday";
                break;
            }
            case 2: {
                monthName = "Tuesday";
                break;
            }
            case 3: {
                monthName = "Wednesday";
                break;
            }
            case 4: {
                monthName = "Thursday";
                break;
            }
            case 5: {
                monthName = "Friday";
                break;
            }
            case 6: {
                monthName = "Saturday";
                break;
            }
            case 7: {
                monthName = "Sunday";
                break;
            }
            default: {
                monthName = "Unknown";
            }
        }
        return monthName;
    }

    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println(daysOfWeek.getDayName(1));
        System.out.println(daysOfWeek.getDayName(2));
        System.out.println(daysOfWeek.getDayName(3));
        System.out.println(daysOfWeek.getDayName(4));
        System.out.println(daysOfWeek.getDayName(5));
        System.out.println(daysOfWeek.getDayName(6));
        System.out.println(daysOfWeek.getDayName(7));
        System.out.println(daysOfWeek.getDayName(-1));
        System.out.println(daysOfWeek.getDayName(1000));
    }
}
