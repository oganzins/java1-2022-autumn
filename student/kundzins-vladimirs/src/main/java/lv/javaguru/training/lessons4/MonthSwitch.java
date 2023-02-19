package lv.javaguru.training.lessons4;

public class MonthSwitch {

    private int monthNumber;

    public MonthSwitch(int nomtNumber) {
        this.monthNumber = nomtNumber;
    }

    public String getMonthNumber() {
        String monthName;

        switch (monthNumber) {
            case 1: {
                monthName = "January";
                break;
            }
            case 2: {
                monthName = "February";
                break;
            }
            case 3: {
                monthName = "Matrh";
                break;
            }
            case 4: {
                monthName = "April";
                break;
            }
            case 5: {
                monthName = "May";
                break;
            }
            case 6: {
                monthName = "Juny";
                break;
            }
            case 7: {
                monthName = "Julay";
                break;
            }
            case 8: {
                monthName = "August";
                break;
            }
            case 9: {
                monthName = "September";
                break;
            }
            case 10: {
                monthName = "October";
                break;
            }
            case 11: {
                monthName = "November";
                break;
            }
            case 12: {
                monthName = "December";
                break;

            }
            default: {
                monthName = "UNKNOWN";
            }
        }
        return monthName;
    }

    public static void main(String[] args) {
        MonthSwitch month = new MonthSwitch(12);
        System.out.println(month.getMonthNumber());
    }

}

