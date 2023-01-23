package lv.javaguru.training.lesson8.multilevel;

public class Manager extends Employee {

    private String businessArea;

    public Manager(String firstName, String lastName, String businessArea) {
        super(firstName, lastName, "Vadītājs");
        this.businessArea = businessArea;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "businessArea='" + businessArea + '\'' +
                "} " + super.toString();
    }
}
