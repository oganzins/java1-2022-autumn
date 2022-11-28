package lesson4.homework;

public class DaysOfWeek {

    private int dayNumber;
private String dayOfWeek;


public String getDayOfWeek(int dayNumber) {
        String dayOfWeek;


        switch (dayNumber) {
            case 1: {
                dayOfWeek = "Monday";
                break;
            }
            case 2: {
                dayOfWeek = "Tuesday";
                break;
            }
            case 3: {
                dayOfWeek = "Wednesday";
                break;

            }
            case 4: {
                dayOfWeek = "Thursday";
                break;
            }
            case 5: {
                dayOfWeek = "Friday";
                break;
            }
            case 6: {
                dayOfWeek = "Saturtday";
                break;
            }
            case 7: {
                dayOfWeek = "Sunday";
                break;
            }
            default: {
                dayOfWeek = "Unknown";
            }
        }
        return dayOfWeek;
    }


    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        System.out.println(daysOfWeek.getDayOfWeek(1));
        System.out.println(daysOfWeek.getDayOfWeek(2));
        System.out.println(daysOfWeek.getDayOfWeek(3));
        System.out.println(daysOfWeek.getDayOfWeek(4));
        System.out.println(daysOfWeek.getDayOfWeek(5));
        System.out.println(daysOfWeek.getDayOfWeek(6));
        System.out.println(daysOfWeek.getDayOfWeek(7));
        System.out.println(daysOfWeek.getDayOfWeek(8));
        System.out.println(daysOfWeek.getDayOfWeek(9));
    }
}
