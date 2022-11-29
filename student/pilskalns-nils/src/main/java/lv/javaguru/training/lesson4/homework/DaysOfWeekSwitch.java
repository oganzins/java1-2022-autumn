package lv.javaguru.training.lesson4.homework;

/*
    Homework accepted
 */
public class DaysOfWeekSwitch {
    private int dayNumber;

    public DaysOfWeekSwitch(int dayNumber) {
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
        DaysOfWeekSwitch daysOfWeekSwitch = new DaysOfWeekSwitch(21);
        System.out.println(daysOfWeekSwitch.getDayName());


    }
}
