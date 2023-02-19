package lv.javaguru.training.lessons6;

public class DaysSwitch {

    public static void main(String[] args) {
        System.out.println(getDay(5));
    }

    public static String getDay(int dayNumber){
        String day = " ";
        switch (dayNumber){
            case 1 : {
                day = "Monday";
                break;
            }
            case 2 : {
                day = "Tuesday";
                break;
            }
            case 3 : {
                day = "Wednesday";
                break;
            }
            case 4 : {
                day = "Thurstday";
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
        }
        return day;
    }
}
