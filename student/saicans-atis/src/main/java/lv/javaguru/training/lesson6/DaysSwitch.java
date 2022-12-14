package lv.javaguru.training.lesson6;

public class DaysSwitch {
    public static String getday(int dayNumber) {
        String day;
        switch (dayNumber) {
            case 1 : {
                day = "Monday";
                break;
            }
            case 2 : {
                day = "Tuesday";
                break;
            }
            case 3 : {
                day = "Wedesday";
                break;
            }
            case 4 : {
                day = "Thursday";
                break;
            }
            case 5 : {
                day = "Friday";
                break;
            }
            case 6 : {
                day = "Saturday";
                break;
            }
            case 7 : {
                day = "Sunday";
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + dayNumber);
        }
        return day;
    }
}
