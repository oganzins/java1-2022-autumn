package lv.javaguru.training.lesson4.homework;

public class DaysOfWeek2 {


    int dayNumber;

    public DaysOfWeek2(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getDayName() {
        String dayName;
        switch (dayNumber) {
            case 1: {
                dayName = "Monday";
                break;
            }
            case 2: {
                dayName = "Tuesday";
                break;
            }
            case 3: {
                dayName = "Wednesday";
                break;
            }
            case 4: {
                dayName = "Thursday";
                break;
            }
            case 5: {
                dayName = "Friday";
                break;
            }
            case 6: {
                dayName = "Saturday";
                break;
            }
            case 7: {
                dayName = "Sunday";
                break;
            }
            default: {
                dayName = "UNKNOWN";
            }
        }
        return dayName;
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











