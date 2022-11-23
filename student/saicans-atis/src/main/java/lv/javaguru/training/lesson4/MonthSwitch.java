package lv.javaguru.training.lesson4;

public class MonthSwitch {
    public MonthSwitch {
        private int montSwitch;
        public MonthSwitch(int monthNumber) {
            this.monthNumber = monthNumber;
        }
        public String getMonthName() {
            String monthName;
            switch (monthNumber) {
                case 1 : {
                    monthName = "January";
                    break;
                }
                case 2 : {
                    monthName = "February";
                    break;
                }
                default: {
                    monthName = "Uknknown";
                }
                }
            }
        }
    }
}
