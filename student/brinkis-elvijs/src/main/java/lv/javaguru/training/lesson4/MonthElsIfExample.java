package lv.javaguru.training.lesson4;

public class MonthElsIfExample {

    private int monthNumbers;

    public MonthElsIfExample(int monthNumbers) {
        this.monthNumbers = monthNumbers;
    }
    public String getMonthName() {
        if (monthNumbers == 1) {
            return "January";
        } else if (monthNumbers == 2) {
            return "February";
        } else if (monthNumbers == 3) {
            return "March";
        } else if (monthNumbers == 4) {
            return "April";
        } else if (monthNumbers == 5) {
            return "May";
        } else if (monthNumbers == 6) {
            return "June";
        } else if (monthNumbers == 7) {
            return "July";
        } else if (monthNumbers == 8) {
            return "August";
        } else if (monthNumbers == 9) {
            return "September";
        } else if (monthNumbers == 10) {
            return "October";
        } else if (monthNumbers == 11) {
            return "November";
        } else if (monthNumbers == 12) {
            return "December";
        } else {
            return "Wrong month number";
        }

    }

    public static void main(String[] args) {
        MonthElsIfExample demo = new MonthElsIfExample(10);

        System.out.println(demo.getMonthName());
    }

}






