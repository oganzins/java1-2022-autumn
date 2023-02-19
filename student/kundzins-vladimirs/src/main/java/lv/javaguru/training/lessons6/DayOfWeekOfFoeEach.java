package lv.javaguru.training.lessons6;

public class DayOfWeekOfFoeEach {
    public static void main(String[] args) {
        String[]dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day : dayOfWeek) {
            System.out.println(day);
        }

        for (int i = 0; i< dayOfWeek.length; i++){
            String day = dayOfWeek[i];
            System.out.println(day);
        }

    }
}
