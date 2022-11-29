package lv.javaguru.training.lesson4;

public class MonthElseIfExample {

    private int monthNumber;

    public MonthElseIfExample(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getMonthName() {
        if (monthNumber == 1) {
            return "January";
        } else if (monthNumber == 2) {
            return "February";
        } else if (monthNumber == 3) {
            return "March";
        } else if (monthNumber == 4) {
            return "April";
        } else if (monthNumber == 5) {
            return "May";
        } else if (monthNumber == 6) {
            return "June";
        } else if (monthNumber == 7) {
            return "July";
        } else if (monthNumber == 8) {
            return "August";
        } else if (monthNumber == 9) {
            return "September";
        } else if (monthNumber == 10) {
            return "October";
        } else if (monthNumber == 11) {
            return "November";
        } else if (monthNumber == 12) {
            return "December";
        } else {
            return "Wrong month number";
        }
    }

    public static void main(String[] args) {
        MonthElseIfExample demo = new MonthElseIfExample(1);

        System.out.println(demo.getMonthName());
    }


}
